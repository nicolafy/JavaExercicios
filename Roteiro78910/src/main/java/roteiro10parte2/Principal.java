/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro10parte2;

/**
 *
 * @author ffnic
 */
public class Principal {

    public static void main(String[] args) {
        
        testarJanelaSemLayout();
        testarJanelaFlowLayout();
        testarJanelaGridLayout();
        testarJanelaBorderLayout();
    }

    public static void testarJanelaSemLayout() {
        JanelaSemLayout janela = new JanelaSemLayout();
        janela.setLocation(50, 50);
    }

    public static void testarJanelaFlowLayout() {
        JanelaFlowLayout janela = new JanelaFlowLayout();
        janela.setLocation(400, 50);
    }

    public static void testarJanelaGridLayout() {
        JanelaGridLayout janela = new JanelaGridLayout();
        janela.setLocation(50, 300); 
    }

    public static void testarJanelaBorderLayout() {
        JanelaBorderLayout janela = new JanelaBorderLayout();
        janela.setLocation(400, 300); 
    }
}
