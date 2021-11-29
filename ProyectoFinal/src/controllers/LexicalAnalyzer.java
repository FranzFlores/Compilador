/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Tokens;

/**
 *
 * @author Smart
 */
public class LexicalAnalyzer {
    
    private Integer position = 0; //Posicion de la cadena
    private Integer status = 0; //Estado del autómata
    private List<String> tokens = new ArrayList<String>(); //Arreglo de Tokens
    private List<String> lexemes = new ArrayList<String>(); //Arreglo de Lexemas
    private String lexeme = ""; //Lexema:Se obtiene del recorrido de la cadena
    private String input; //Entrada de datos
    private Character character; //Caracter a evaluar

    private Utilities u = new Utilities();
    
    public LexicalAnalyzer(String input) {
        this.input = input;
    }

    //Imprimir los resultados del análisis léxico
    public void printResults() {
        System.out.println("Listo.........");
        for (int i = 0; i < tokens.size(); i++) {
            System.out.println("TOKEN: " + tokens.get(i) + " LEXEMA: " + lexemes.get(i));
        }
    }

    //Proceso de Autómata
    public void process() {
        
    }

    //Almacenar lexemas y tokens
    private void loadLexeme(String lexeme, String token) {
        lexemes.add(lexeme);
        tokens.add(token);
    }
    
    //Determinar que el caracter es un símbolo
    private void loadSymbol(String tokenType) {
        loadLexeme(lexeme, tokenType);
        status = 0;
        lexeme = "";
        lexeme += Character.toString(character);
        
        switch(character) {
            case '+':
                loadLexeme(lexeme, Tokens.SUMA.toString());
                lexeme = "";
            break;
            case '-':
                loadLexeme(lexeme, Tokens.RESTA.toString());
                lexeme = "";
            break;
            case '*':
                loadLexeme(lexeme, Tokens.MULTIPLICACION.toString());
                lexeme = "";
            break;
            case ';':
                loadLexeme(lexeme, Tokens.SEPARACION.toString());
                lexeme = "";
            break;
            default: break;
        }
    }
    
    
    //Método Principal
    public static void main(String args[]) {
        String input = "var a, = 98 + 56 print a";
        LexicalAnalyzer lexical = new LexicalAnalyzer(input);
        lexical.process();
        lexical.printResults();
    }
}
