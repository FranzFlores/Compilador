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
public class LexicalAnalyzerv1 {
    
    private Integer position = 0; //Posicion de la cadena
    private Integer status = 0; //Estado del autómata
    private List<String> tokens = new ArrayList<String>(); //Arreglo de Tokens
    private List<String> lexemes = new ArrayList<String>(); //Arreglo de Lexemas
    private String lexeme = ""; //Lexema:Se obtiene del recorrido de la cadena
    private String input; //Entrada de datos
    private Character character; //Caracter a evaluar

    private Utilities u = new Utilities();
    
    public LexicalAnalyzerv1(String input) {
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
        //Obetener caracter de entrada
        character = input.charAt(position);
        
        switch(status) {
            case 0:
               if(u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                  lexeme += Character.toString(character);
                  status = 0;
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
                    case '=':
                        status = 4;
                    break;
                    case ';':
                        loadLexeme(lexeme, Tokens.SEPARACION.toString());
                        lexeme = "";
                    break;
                    default: break;
                  }  
               } else if(Character.isDigit(character)) {
                    lexeme += Character.toString(character);
                    status = 8;
               } else if(Character.isLetter(character)) {
                   lexeme += Character.toString(character);
                   if(character == 'x') {
                        loadLexeme(lexeme, Tokens.VARIABLEX.toString());
                        lexeme = "";
                   } else if(character == 'y') {
                        loadLexeme(lexeme, Tokens.VARIABLEY.toString());
                        lexeme = "";
                   } else if(character == 'E'){
                       status = 14;
                   } else if(character == 's'){
                       status = 19;
                   } 
               } else {
                    lexeme += Character.toString(character);
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";  
                    status = 0;
               }
            break;
            case 4:
                status = 0;
                if(u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    if(character == '>') {
                        lexeme += Character.toString(character);
                        loadLexeme(lexeme, Tokens.ASIGNACION.toString());
                        lexeme = ""; 
                   } else {
                       loadSymbol(Tokens.IGUALDAD.toString());
                       lexeme = "";
                   }
                } else if(Character.isDigit(character)) {
                    loadSymbol(Tokens.IGUALDAD.toString());
                    lexeme = "";
                    status = 8;
                    lexeme += Character.toString(character);
               } else if(Character.isLetter(character)) {
                    loadLetter(Tokens.IGUALDAD.toString());
               }  else {
                   loadLexeme(lexeme, Tokens.ERROR.toString());
                   lexeme = "";
               }
            break;
            case 8:
            
            break;
            default: break;
        }
        position++;
        if(position >= input.length()) {
        } else {
            process();
        }
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
    
    private void loadLetter(String tokenType) {
        loadLexeme(lexeme, tokenType);
        lexeme = "";
        lexeme += Character.toString(character);
        if(character == 'x') {
            loadLexeme(lexeme, Tokens.VARIABLEX.toString());
            lexeme = "";
            status = 0;
        } else if(character == 'y') {
            loadLexeme(lexeme, Tokens.VARIABLEY.toString());
            lexeme = "";
            status = 0;
        } else if(character == 'E'){
            status = 14;
        } else if(character == 's'){
            status = 19;
        } 
    }
    
    
    //Método Principal
    public static void main(String args[]) {
        String input = "+-*=;=>xy=>+-*;xy@";
        LexicalAnalyzerv1 lexical = new LexicalAnalyzerv1(input);
        lexical.process();
        lexical.printResults();
    }
}
