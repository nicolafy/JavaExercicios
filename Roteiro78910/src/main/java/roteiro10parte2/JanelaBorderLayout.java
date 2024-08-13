/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro10parte2;

/**
 *
 * @author ffnic
 */
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaBorderLayout extends JFrame {
    
    public JanelaBorderLayout() {
        setTitle("Janela com BorderLayout");
        
       
        setLayout(new BorderLayout());
        
       
        JButton btnNorte = new JButton("Norte");
        add(btnNorte, BorderLayout.NORTH);
        
        JButton btnSul = new JButton("Sul");
        add(btnSul, BorderLayout.SOUTH);
        
        JButton btnLeste = new JButton("Leste");
        add(btnLeste, BorderLayout.EAST);
        
        JButton btnOeste = new JButton("Oeste");
        add(btnOeste, BorderLayout.WEST);
        
        JButton btnCentro = new JButton("Centro");
        add(btnCentro, BorderLayout.CENTER);
        
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
