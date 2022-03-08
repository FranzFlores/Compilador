/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import models.Equation;

/**
 *
 * @author andre
 */
public class Utilities {
    //Operation: 2(Suma), 3(Resta) 
    public static boolean validateNumber(Double number){
        return number >= 0;
    }
    
    public static Equation setEquationData(Double A, Double B, Double C) {
        Equation e = new Equation(A,B,C);
        return e;
    }
    
    public static Double resolveX(Equation E1, Equation E2){
        Double x = ((E1.getC()*E2.getB()) - (E1.getB()*E2.getC()))/((E1.getA()*E2.getB())-(E1.getB()*E2.getA()));
        System.out.println("Resultado de X: " + x);
        return x;
    }
    
    public static Double resolveY(Equation E1, Equation E2){
        Double y = ((E1.getA()*E2.getC())-(E1.getC()*E2.getA()))/((E1.getA()*E2.getB())-(E1.getB()*E2.getA())); 
        System.out.println("Resultado de Y: " + y);
        return y;
    }
    
    
    
}
