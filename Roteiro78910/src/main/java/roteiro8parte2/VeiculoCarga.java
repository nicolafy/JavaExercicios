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
public class VeiculoCarga extends Veiculo {
    private int pesoMax;

    public VeiculoCarga(String placa, int anoFabricacao, int pesoMax) {
        super(placa, anoFabricacao);
        this.pesoMax = pesoMax;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

  
    public double calcularPedagio() {
        
        return super.calcularPedagio();
    }
}
    