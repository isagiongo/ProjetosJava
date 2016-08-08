
package gui;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Isa Gb
 */
public class JanelaBaskaraSwing extends JFrame{
    
    private JButton btCalcular;
    private JTextField tfA;
    private JTextField tfB;
    private JTextField tfC;
    private JLabel lbA;
    private JLabel lbB;
    private JLabel lbC;
    private JLabel lbX1;
    private JLabel lbX2;
    private JLabel lbResultX1;
    private JLabel lbResultX2;
    
    private Container container;
    
    public JanelaBaskaraSwing(){
        super("Fórmula de Báskara");
        
        container = this.getContentPane();
        container.setLayout(new FlowLayout());
        
        btCalcular = new JButton("Calcular");
        tfA = new JTextField(15);
        tfB = new JTextField(15);
        tfC = new JTextField(15);
        lbA = new JLabel ("A");
        lbB = new JLabel ("B");
        lbC = new JLabel ("C");
        lbX1 = new JLabel ("X': ");
        lbX2 = new JLabel ("X'': ");
        lbResultX1 = new JLabel ("0.0");
        lbResultX2 = new JLabel ("0.0");
        
        container.add(lbA);
        container.add(tfA);
        container.add(lbB);
        container.add(tfB);
        container.add(lbC);
        container.add(tfC);
        container.add(btCalcular);
        container.add(lbX1);
        container.add(lbResultX1);
        container.add(lbX2);
        container.add(lbResultX2);
        
        this.setSize(640, 480);
        this.setVisible(true);
        
    }
    
public static void main(String[] args){
    
    JanelaBaskaraSwing jb = new JanelaBaskaraSwing();
    
   
    
    
}
    
}
