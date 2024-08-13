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
import java.awt.GridLayout;

public class JanelaGridLayout extends JFrame {

    private int largura = 300;
    private int altura = 300;

    public JanelaGridLayout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(largura, altura);
        setTitle("Janela com GridLayout");
        setLayout(new GridLayout(3, 2));
        iniciarComponentes();
        setVisible(true);
    }

    private void iniciarComponentes() {
        for (int i = 1; i <= 6; i++) {
            JButton btn = new JButton("Botão " + i);
            add(btn);
        }
    }

    public static void main(String[] args) {
        JanelaGridLayout janela = new JanelaGridLayout();
    }
}
