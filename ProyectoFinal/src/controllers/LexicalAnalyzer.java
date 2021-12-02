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
        //Obetener caracter de entrada
        character = input.charAt(position);

        switch (status) {
            case 0:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    lexeme += Character.toString(character);
                    status = 0;
                    switch (character) {
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
                        default:
                            break;
                    }
                } else if (Character.isDigit(character)) {
                    lexeme += Character.toString(character);
                    status = 8;
                } else if (Character.isLetter(character)) {
                    lexeme += Character.toString(character);
                    if (character == 'x') {
                        loadLexeme(lexeme, Tokens.VARIABLEX.toString());
                        lexeme = "";
                    } else if (character == 'y') {
                        loadLexeme(lexeme, Tokens.VARIABLEY.toString());
                        lexeme = "";
                    } else if (character == 'E') {
                        status = 14;
                    } else if (character == 's') {
                        status = 19;
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
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
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    if (character == '>') {
                        lexeme += Character.toString(character);
                        loadLexeme(lexeme, Tokens.ASIGNACION.toString());
                        lexeme = "";
                    } else {
                        loadSymbol(Tokens.IGUALDAD.toString());
                        lexeme = "";
                    }
                } else if (Character.isDigit(character)) {
                    loadSymbol(Tokens.IGUALDAD.toString());
                    lexeme = "";
                    status = 8;
                    lexeme += Character.toString(character);
                } else if (Character.isLetter(character)) {
                    loadLetter(Tokens.IGUALDAD.toString());
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                }
                break;
            case 8:
                break;
            case 14:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isLetter(character)) {
                    if (character == 'C') {
                        lexeme += Character.toString(character);
                        status = 15;
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        lexeme += Character.toString(character);
                        status = 0;
                    }
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            case 15:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isDigit(character)) {
                    lexeme += Character.toString(character);
                    if (character == '1') {
                        loadLexeme(lexeme, Tokens.ECUACION1.toString());
                        status = 0;
                        lexeme = "";
                    } else if (character == '2') {
                        loadLexeme(lexeme, Tokens.ECUACION2.toString());
                        status = 0;
                        lexeme = "";
                    } else {
                        lexeme += Character.toString(character);
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
                    }
                } else {
                    lexeme += Character.toString(character);
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            case 19:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isLetter(character)) {
                    lexeme += Character.toString(character);
                    if (character == 'o') {
                        status = 20;
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
                    }
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            case 20:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isLetter(character)) {
                    lexeme += Character.toString(character);
                    if (character == 'l') {
                        status = 21;
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
                    }
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            case 21:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isLetter(character)) {
                    lexeme += Character.toString(character);
                    if (character == 'u') {
                        status = 22;
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
                    }
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            case 22:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isLetter(character)) {
                    lexeme += Character.toString(character);
                    if (character == 'c') {
                        status = 23;
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
                    }
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            case 23:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isLetter(character)) {
                    lexeme += Character.toString(character);
                    if (character == 'i') {
                        status = 24;
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
                    }
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            case 24:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isLetter(character)) {
                    lexeme += Character.toString(character);
                    if (character == 'o') {
                        status = 25;
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
                    }
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            case 25:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isLetter(character)) {
                    lexeme += Character.toString(character);
                    if (character == 'n') {
                        status = 26;
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
                    }
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            case 26:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isLetter(character)) {
                    lexeme += Character.toString(character);
                    if (character == 'a') {
                        status = 27;
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
                    }
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            case 27:
                if (u.verifyChar(u.getSymbols(), String.valueOf(character))) {
                    loadSymbol(Tokens.ERROR.toString());
                } else if (Character.isLetter(character)) {
                    lexeme += Character.toString(character);
                    if (character == 'r') {
                        loadLexeme(lexeme, Tokens.SOLUCIONAR.toString());
                        status = 0;
                        lexeme = "";
                    } else {
                        loadLexeme(lexeme, Tokens.ERROR.toString());
                        lexeme = "";
                        status = 0;
                    }
                } else {
                    loadLexeme(lexeme, Tokens.ERROR.toString());
                    lexeme = "";
                    status = 0;
                }
                break;
            default:
                break;
        }
        position++;
        if (position >= input.length()) {
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

        switch (character) {
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
            default:
                break;
        }
    }

    private void loadLetter(String tokenType) {
        loadLexeme(lexeme, tokenType);
        lexeme = "";
        lexeme += Character.toString(character);
        if (character == 'x') {
            loadLexeme(lexeme, Tokens.VARIABLEX.toString());
            lexeme = "";
            status = 0;
        } else if (character == 'y') {
            loadLexeme(lexeme, Tokens.VARIABLEY.toString());
            lexeme = "";
            status = 0;
        } else if (character == 'E') {
            status = 14;
        } else if (character == 's') {
            status = 19;
        }
    }

    //Método Principal
    public static void main(String args[]) {
        String input = "EC+x+EC1+-EC2*-+solucionarsol+solu-soluci*";
        LexicalAnalyzer lexical = new LexicalAnalyzer(input);
        lexical.process();
        lexical.printResults();
    }
}
