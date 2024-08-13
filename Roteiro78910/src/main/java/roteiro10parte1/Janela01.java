/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro10parte1;

/**
 *
 * @author ffnic
 */
import javax.swing.JFrame;

public class Janela01 extends JFrame {
    
    private int largura;
    private int altura;
    
    public Janela01(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        
        configurarJanela();
    }
    
    private void configurarJanela() {
        setTitle("Janela01");
        setSize(largura, altura);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
