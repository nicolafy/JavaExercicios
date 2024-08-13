/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro10parte1;

/**
 *
 * @author ffnic
 */
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela02 extends JFrame {
    
    private int largura;
    private int altura;
    
  
    private JButton btn01;
    private JButton btn02;
    
    public Janela02(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        
        configurarJanela();
        inicializarComponentes();
    }
    
    private void configurarJanela() {
        setTitle("Janela02");
        setSize(largura, altura);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
     
        this.setLayout(null);
    }
    
    private void inicializarComponentes() {
      
        btn01 = new JButton("Botao 01");
        btn02 = new JButton("Botao 02");
        
   
        btn01.setBounds(50, 50, 100, 30); 
        btn02.setBounds(200, 50, 100, 30); 
        
       
        this.add(btn01);
        this.add(btn02);
    }
    
    public static void main(String[] args) {
        Janela02 minhaSegundaJanela = new Janela02(400, 200);
        minhaSegundaJanela.setVisible(true);
    }
}
