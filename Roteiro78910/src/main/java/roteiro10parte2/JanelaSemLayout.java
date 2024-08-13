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
public class JanelaSemLayout extends JFrame {

    private int largura = 500;
    private int altura = 500;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;

    public JanelaSemLayout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(largura, altura);
        setTitle("Janela Sem Layout");
        setLayout(null); 
        iniciarComponentes();
        setVisible(true);
    }

    private void iniciarComponentes() {
        btn01 = new JButton("Botão 1");
        btn01.setBounds(50, 50, 100, 30);
        add(btn01);

        btn02 = new JButton("Botão 2");
        btn02.setBounds(200, 50, 100, 30);
        add(btn02);

        btn03 = new JButton("Botão 3");
        btn03.setBounds(50, 150, 100, 30);
        add(btn03);

        btn04 = new JButton("Botão 4");
        btn04.setBounds(200, 150, 100, 30);
        add(btn04);

        btn05 = new JButton("Botão 5");
        btn05.setBounds(50, 250, 100, 30);
        add(btn05);

        btn06 = new JButton("Botão 6");
        btn06.setBounds(200, 250, 100, 30);
        add(btn06);
    }

    public static void main(String[] args) {
        JanelaSemLayout janela = new JanelaSemLayout();
    }}