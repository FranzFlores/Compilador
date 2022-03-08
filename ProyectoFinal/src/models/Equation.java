/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author andre
 */
public class Equation {

    public Equation(Double A, Double B, Double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    private Double A;
    private Double B;
    private Double C;

    public Double getA() {
        return A;
    }

    public void setA(Double A) {
        this.A = A;
    }

    public Double getB() {
        return B;
    }

    public void setB(Double B) {
        this.B = B;
    }

    public Double getC() {
        return C;
    }

    public void setC(Double C) {
        this.C = C;
    }
    
}
