/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro10parte2;

/**
 *
 * @author ffnic
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class JanelaFlowLayout extends JFrame {

    private int largura = 400;
    private int altura = 200;

    public JanelaFlowLayout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(largura, altura);
        setTitle("Janela com FlowLayout");
        setLayout(new FlowLayout());
        iniciarComponentes();
        setVisible(true);
    }

    private void iniciarComponentes() {
        for (int i = 1; i <= 5; i++) {
            JButton btn = new JButton("Botão " + i);
            add(btn);
        }
    }

    public static void main(String[] args) {
        JanelaFlowLayout janela = new JanelaFlowLayout();
    }
}
