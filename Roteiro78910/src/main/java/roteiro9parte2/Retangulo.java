/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro9parte2;

import roteiro9parte1.*;

/**
 *
 * @author ffnic
 */
public class Retangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

  
    public String getNomeFigura() {
        return "Retangulo";
    }

   
    public double getArea() {
        return base * altura;
    }

  
    public double getPerimetro() {
        return 2 * (base + altura);
    
    }

    
    public double getperimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
