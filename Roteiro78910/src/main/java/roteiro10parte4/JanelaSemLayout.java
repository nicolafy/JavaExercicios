/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro10parte4;

/**
 *
 * @author ffnic
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaSemLayout extends JFrame implements ActionListener {
    private int largura = 500;
    private int altura = 500;
    private JButton btn01;
    private JButton btn02;

    public JanelaSemLayout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(largura, altura);
        setTitle("Janela Sem Layout");

        iniciarComponentes();

        setVisible(true);
    }

    public void iniciarComponentes() {
        btn01 = new JButton("Botão 1");
        btn01.setBounds(50, 50, 100, 30);
        btn01.addActionListener(this); 

        btn02 = new JButton("Botão 2");
        btn02.setBounds(200, 50, 100, 30);
        btn02.addActionListener(this);

        add(btn01);
        add(btn02);

        setLayout(null); 

      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn01) {
            JOptionPane.showMessageDialog(this, "Botão 1 clicado!");
        } else if (e.getSource() == btn02) {
            JOptionPane.showMessageDialog(this, "Botão 2 clicado!");
        }
    }

    public static void main(String[] args) {
        new JanelaSemLayout();
    }
}