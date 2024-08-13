/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro8parte2;

import roteiro8parte1.*;

/**
 *
 * @author ffnic
 */
  public class VeiculoPequeno extends Veiculo {
    private String modelo;

    public VeiculoPequeno(String placa, int anoFabricacao, String modelo) {
        super(placa, anoFabricacao);
        this.modelo = modelo;
        this.taxaPedagio = 6.00; 
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }}