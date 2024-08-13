/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro8parte1;

/**
 *
 * @author ffnic
 */
/*faz sentido a criação do veículo v01, já que ele não
é nenhum dos 3 tipos descrito ? Considera isso uma falha de projeto?
 pode indicar uma falha de projeto, dependendo do contexto 
 e dos requisitos do sistema em questão*/

public class Principal {
    public static void main(String[] args){
        
        VeiculoCarga veiculoCarga = new VeiculoCarga("ABC1234", 2022, 5000);
        VeiculoPasseio veiculoPasseio = new VeiculoPasseio("XYZ5678", 2023, 5);
        VeiculoPequeno veiculoPequeno = new VeiculoPequeno("DEF4321", 2021, "Fiat Uno");

     
        System.out.println("Informacoes do Veiculo de Carga:");
        System.out.println("Placa: " + veiculoCarga.getPlaca());
        System.out.println("Ano de Fabricacao: " + veiculoCarga.getAnoFabricacao());
        System.out.println("Peso Maximo: " + veiculoCarga.getPesoMax() + " kg");
        System.out.println();

        System.out.println("Informacoes do Veiculo de Passeio:");
        System.out.println("Placa: " + veiculoPasseio.getPlaca());
        System.out.println("Ano de Fabricacao: " + veiculoPasseio.getAnoFabricacao());
        System.out.println("Quantidade Maxima de Passageiros: " + veiculoPasseio.getQtdeMaxPassageiros());
        System.out.println();

        System.out.println("Informacoes do Veiculo Pequeno:");
        System.out.println("Placa: " + veiculoPequeno.getPlaca());
        System.out.println("Ano de Fabrico: " + veiculoPequeno.getAnoFabricacao());
        System.out.println("Modelo: " + veiculoPequeno.getModelo());
    }
}                