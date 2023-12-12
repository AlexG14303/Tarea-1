/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumarareas;

/**
 *
 * @author david
 */
public class Triangulo {
    //Constructor
    public Triangulo(double ld1, double ld2, double ld3){
        this.lado1 = ld1;
        this.lado2 = ld2;
        this.lado3 = ld3;
    }
    //
    private double lado1;
    private double lado2;
    private double lado3;
    
    //Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
    //Area por semiperimetro
    public double area() {
    double s = (this.lado1 + this.lado2 + this.lado3) / 2.0;
    double a = Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
    return a;
    }
}
