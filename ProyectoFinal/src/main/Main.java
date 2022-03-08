/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controllers.LexerCup;
import controllers.Syntax;
import java.io.StringReader;
import java_cup.runtime.Symbol;

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "EC1: 2x + 3y = 20; \n EC2: 3x + 2y = 23; \n solucionar ";
        Syntax s = new Syntax(new LexerCup(new StringReader(cadena)));
        try {
            s.parse();
//            System.out.println("Ejecución Exitosa");
        } catch (Exception e) {
            e.printStackTrace();
            Symbol sym = s.getS();
            System.out.println("Error de sintaxis linea " + (sym.right + 1) + " columna " +(sym.left + 1) + " Texto " + sym.value);
        }
    }
}
