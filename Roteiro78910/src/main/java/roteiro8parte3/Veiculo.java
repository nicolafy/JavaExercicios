/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro8parte3;

import roteiro8parte2.*;
import roteiro8parte1.*;

/**
 *
 * @author ffnic
 */
public abstract class Veiculo {
    private String placa;
    private int anoFabricacao;
    protected double taxaPedagio; 

    public Veiculo(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.taxaPedagio = 6.00; 
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    
    public double calcularPedagio() {
        return taxaPedagio; 
    }
}