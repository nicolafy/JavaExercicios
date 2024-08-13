/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro9parte2;

/**
 *
 * @author ffnic
 */
public class Circulo implements FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    
    public String getNomeFigura() {
        return "Circulo";
    }

  
    public double getArea() {
        return Math.PI * raio * raio;
    }

   
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double getperimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}