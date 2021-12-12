/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 59399
 */
public class LexicalAnalyzer {

    public static List<Token> lexico(String input) {
        List<Token> tokens = new ArrayList<Token>();
        //Separar el punto y coma
        if (input.contains(";")) {
          input = input.replace(";"," ;");
        }
        //
        StringTokenizer tokenizer = new StringTokenizer(input);
        //
        while (tokenizer.hasMoreElements()) {
            String palabra = tokenizer.nextToken(); //Para el siguiente
            System.out.println("ingresa " + palabra);
            
            boolean matched = false;
            for (Tipos tokentipo : Tipos.values()) {
                Pattern patron = Pattern.compile(tokentipo.patron);
                //System.out.println("patron " + patron);
                Matcher matcher = patron.matcher(palabra); //Verificar si coincide con la palabra
                //System.out.println("matcher " + palabra);
                if (matcher.find()) {
                    
                    Token token = new Token();
                    //System.out.println("tokentipo " + tokentipo);
                    token.setTipo(tokentipo);
                    //System.out.println("palabra " + palabra);
                    token.setValor(palabra);
                    tokens.add(token);
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                //throw  new RuntimeException("Token INVALIDO "+palabra);
                Token token = new Token();
                token.setTipo(null);
                token.setValor(palabra);
                tokens.add(token);
                //throw  new RuntimeException("Token INVALIDO "+palabra);
            }
        }
        return tokens;
    }

    public static void main(String[] args) {
        String input = "SOLUCIONAR EC3 => 6x + 4y = 9.766432434 SOLUCIONRA -4 +5 /6 *3 4x;";
        List<Token> lista = lexico(input);
        for (Token token : lista) {
            if(token.getTipo() !=null){
                System.out.println(token.getTipo().toString() + " " + token.getValor());
            }
            else{
                System.out.println("ERROR" + " "+token.getValor());
            }
            
        }
    }
    
}
