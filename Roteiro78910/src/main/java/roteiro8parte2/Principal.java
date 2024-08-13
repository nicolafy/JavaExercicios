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
/*
O cálculo do pedágio teve o resultado esperado ?
 Não, o problema pode estar relacionado à implementação do método.
*/
public class Principal{
    public static void main(String[] args) {
       
        Cliente cliente = new Cliente("1234567890", "Empresa X", "Rua Principal, 123", "cliente@empresa.com", "(11) 98765-4321");

    
        VeiculoCarga veiculoCarga = new VeiculoCarga("ABC1234", 2022, 5000);
        VeiculoPasseio veiculoPasseio = new VeiculoPasseio("XYZ5678", 2023, 5);
        VeiculoPequeno veiculoPequeno = new VeiculoPequeno("DEF4321", 2021, "Fiat Uno");

     
        cliente.setVeiculo(veiculoCarga);

       
        System.out.println("Informações do Cliente:");
        System.out.println("CNPJ: " + cliente.getCnpj());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());

        
        Veiculo veiculoAssociado = cliente.getVeiculo();
        if (veiculoAssociado != null) {
          
            System.out.println("\nInformações do Veículo:");
            System.out.println("Placa: " + veiculoAssociado.getPlaca());
            System.out.println("Ano de Fabricação: " + veiculoAssociado.getAnoFabricacao());
            System.out.println("Pedágio: R$ " + veiculoAssociado.calcularPedagio());
        } else {
            System.out.println("\nCliente não possui veículo associado.");
        }
    }
}