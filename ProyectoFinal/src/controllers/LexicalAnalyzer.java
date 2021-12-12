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
import models.Types;

/**
 *
 * @author 59399
 */
public class LexicalAnalyzer {

    public static List<Token> lexico(String input) {
        List<Token> tokens = new ArrayList<>();
        //Separar el punto y coma
        if (input.contains(";")) {
            input = input.replace(";", " ;");
        } 
         //Separar multiplicación
        if(input.contains("*")) {
            input = input.replace("*", " * ");
        }

        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreElements()) {
            String word = tokenizer.nextToken(); //Para el siguiente
            boolean matched = false;
            for (Types tokentype : Types.values()) {
                Pattern patron = Pattern.compile(tokentype.pattern);
                Matcher matcher = patron.matcher(word); //Verificar si coincide con la palabra
                if (matcher.find()) {
                    Token token = new Token();
                    token.setType(tokentype);
                    token.setValue(word);
                    tokens.add(token);
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                Token token = new Token();
                token.setType(null);
                token.setValue(word);
                tokens.add(token);
            }
        }
        return tokens;
    }

    public static void main(String[] args) {
        String input = "EC1 => -2*x + 3*y = 5; \n EC2 => 3*x - 3.5*y = 3; \n solucionar" ;
        List<Token> lista = lexico(input);
        lista.forEach(token -> {
            if (token.getType() != null) {
                System.out.println(token.getType().toString() + " " + token.getValue());
            } else {
                System.out.println("ERROR" + " " + token.getValue());
            }
        });
    }
}
