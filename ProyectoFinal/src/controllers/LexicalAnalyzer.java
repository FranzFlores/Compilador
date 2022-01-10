/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.FileReader;
import jflex.Main;
import models.Tokens;

/**
 *
 * @author Smart
 */
public class LexicalAnalyzer {
    
    private static String path = "data" + File.separatorChar;

    public static void main(String[] args) {

//        generateFile();
        evaluateData();
    }
    
     public static void generateFile() {
        try {
            String[] files = {(path + "Lexer.flex")};
            Main.generate(files);
        } catch (Exception e) {
            System.out.println("Error en generar archivo" + e);
        }
    }

    public static void evaluateData() {
        try {
            Lexer lexer = new Lexer(new FileReader(path + "code.jcr"));
            String result = "";
            while (true) {
                Tokens token = lexer.yylex();
                if (token == null) {
                    result += "FIN";
                    break;
                }
                switch (token) {
                    case SUMA:
                        result += lexer.lexem + " Es una suma";
                        break;
                    case RESTA:
                        result += lexer.lexem + " Es una resta";
                        break;
                    case MULTIPLICACION:
                        result += lexer.lexem + " Es una multiplicación";
                        break;
                    case ASIGNACION:
                        result += lexer.lexem + " Es una asignación";
                        break;
                    case IGUALDAD:
                        result += lexer.lexem + " Es una igualdad";
                        break;
                    case SEPARADOR:
                        result += lexer.lexem + " Es un separador";
                        break;
                    case ENTERO_POSITIVO:
                        result += lexer.lexem + " Es un número entero positivo";
                        break;
                    case ENTERO_NEGATIVO:
                        result += lexer.lexem + " Es un número entero negativo";
                        break;
                    case DECIMAL_POSITIVO:
                        result += lexer.lexem + " Es un número decimal positivo";
                        break;
                    case DECIMAL_NEGATIVO:
                        result += lexer.lexem + " Es un número decimal negativo";
                        break;
                    case VARIABLEX:
                        result += lexer.lexem + " Es la variable X";
                        break;
                    case VARIABLEY:
                        result += lexer.lexem + " Es la variable Y";
                        break;
                    case ECUACION:
                        result += lexer.lexem + " Es una ecuación";
                        break;
                    case PALABRA_RESERVADA:
                        result += lexer.lexem + " Es la palabra reservada solucionar";
                        break;
                    case ERROR:
                        result += lexer.lexem + " Es un símbolo desconocido";
                        break;
                }
                System.out.println(result);
                result = "";
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
