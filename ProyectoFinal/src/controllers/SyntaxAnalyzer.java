/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.StringReader;
import java_cup.runtime.Symbol;


/**
 *
 * @author 59399
 */
public class SyntaxAnalyzer {
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "EC1: -2x + 3y = 5; \n EC2 => 3*x - 3.5*y = 3; \n solucionar ";
        Sintax s = new Sintax(new LexerCup(new StringReader(cadena)));
        try {
            s.parse();
        } catch (Exception e) {
            Symbol sym = s.getS();
            System.out.println("Error de sintaxis linea " + (sym.right + 1) + " columna " +(sym.left + 1) + " Texto " + sym.value);
        }
    }
}
