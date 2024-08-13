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

public class JanelaBorderLayout_v1 {

    private JFrame frame;
    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;

    public JanelaBorderLayout_v1() {
        frame = new JFrame("Janela com BorderLayout");

        // Criando os painéis
        pnCabecalho = new JPanel();
        pnRodape = new JPanel();
        pnEsquerda = new JPanel();
        pnDireita = new JPanel();
        pnCentro = new JPanel();

        configurarJanela();
        adicionarComponentes();
        exibirJanela();
    }

    private void configurarJanela() {
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void adicionarComponentes() {
       
        pnCabecalho.setBackground(Color.RED);
        pnRodape.setBackground(Color.GREEN);
        pnEsquerda.setBackground(Color.BLUE);
        pnDireita.setBackground(Color.YELLOW);
        pnCentro.setBackground(Color.WHITE);

        
        frame.add(pnCabecalho, BorderLayout.NORTH);
        frame.add(pnRodape, BorderLayout.SOUTH);
        frame.add(pnEsquerda, BorderLayout.WEST);
        frame.add(pnDireita, BorderLayout.EAST);
        frame.add(pnCentro, BorderLayout.CENTER);
    }

    private void exibirJanela() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaBorderLayout_v1();
    }
}
