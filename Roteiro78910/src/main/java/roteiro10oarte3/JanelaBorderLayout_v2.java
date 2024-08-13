/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro10oarte3;

/**
 *
 * @author ffnic
 */
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaBorderLayout_v2 {

    private JFrame frame;
    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;

    public JanelaBorderLayout_v2() {
        frame = new JFrame("Janela com BorderLayout");

        // Criando os painéis
        pnCabecalho = new JPanel();
        pnRodape = new JPanel();
        pnEsquerda = new JPanel();
        pnDireita = new JPanel();
        pnCentro = new JPanel();

        configurarJanela();
        iniciarComponentes();
        exibirJanela();
    }

    private void configurarJanela() {
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
      
        iniciarPainelCabecalho();
        iniciarPainelRodape();
        iniciarPainelEsquerda();
        iniciarPainelDireita();
        iniciarPainelCentro();

        
        frame.add(pnCabecalho, BorderLayout.NORTH);
        frame.add(pnRodape, BorderLayout.SOUTH);
        frame.add(pnEsquerda, BorderLayout.WEST);
        frame.add(pnDireita, BorderLayout.EAST);
        frame.add(pnCentro, BorderLayout.CENTER);
    }

    private void iniciarPainelCabecalho() {
       
        JLabel label = new JLabel("Cabeçalho");
        pnCabecalho.add(label);
    }

    private void iniciarPainelRodape() {
     
        JButton btn = new JButton("Rodapé");
        pnRodape.add(btn);
    }

    private void iniciarPainelEsquerda() {
      
        JTextField textField = new JTextField(10);
        pnEsquerda.add(textField);
    }

    private void iniciarPainelDireita() {
      
        JButton btn = new JButton("Direita");
        pnDireita.add(btn);
    }

    private void iniciarPainelCentro() {
      
        JLabel label = new JLabel("Centro");
        pnCentro.add(label);
    }

    private void exibirJanela() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaBorderLayout_v2();
    }
}
