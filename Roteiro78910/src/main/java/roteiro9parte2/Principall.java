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
/*Podemos dizer que esta técnica faz uso de Polimorfismo ? Sim/Não ? Explique. 7
Sim, através da implementação das interfaces*/
public class Principall{
    public static void main(String[] args){
       
        Quadrado quadrado = new Quadrado(5.0);
        Retangulo retangulo = new Retangulo(3.0,4.0);
        Circulo circulo = new Circulo(2.0);
        
        
        System.out.println("Quadrado:");
         System.out.println("Nome da figura:" + quadrado.getNomeFigura());
          System.out.println("Area:" + quadrado.getArea());
           System.out.println("perimetro:" + quadrado.getPerimetro());
         
                  System.out.println("\nRetangulo:");
        System.out.println("Nome da Figura: " + retangulo.getNomeFigura());
        System.out.println("Area: " + retangulo.getArea());
        System.out.println("Perimetro: " + retangulo.getPerimetro());
        
            System.out.println("\nCirculo:");
        System.out.println("Nome da Figura: " + circulo.getNomeFigura());
        System.out.println("Area: " + circulo.getArea());
        System.out.println("Perimetro: " + circulo.getPerimetro());
    }
}