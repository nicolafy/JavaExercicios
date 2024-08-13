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
public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

   
    public String getNomeFigura() {
        return "Quadrado";
    }

    public double getArea() {
        return lado * lado;
    }


    public double getPerimetro() {
        return 4 * lado;
    
    }

    
    public double getperimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }