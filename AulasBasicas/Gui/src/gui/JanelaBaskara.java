
package gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author Isa Gb
 */
public class JanelaBaskara extends Frame{
    
    private Button btCalcular;
    private TextField tfA;
    private TextField tfB;
    private TextField tfC;
    private Label lbA;
    private Label lbB;
    private Label lbC;
    private Label lbX1;
    private Label lbX2;
    private Label lbResultX1;
    private Label lbResultX2;
    
    public JanelaBaskara(){
        super("Fórmula de Báskara");
        this.setLayout(new FlowLayout());
        
        btCalcular = new Button("Calcular");
        tfA = new TextField(15);
        tfB = new TextField(15);
        tfC = new TextField(15);
        lbA = new Label ("A");
        lbB = new Label ("B");
        lbC = new Label ("C");
        lbX1 = new Label ("X': ");
        lbX2 = new Label ("X'': ");
        lbResultX1 = new Label ("0.0");
        lbResultX2 = new Label ("0.0");
        
        this.add(lbA);
        this.add(tfA);
        this.add(lbB);
        this.add(tfB);
        this.add(lbC);
        this.add(tfC);
        this.add(btCalcular);
        this.add(lbX1);
        this.add(lbResultX1);
        this.add(lbX2);
        this.add(lbResultX2);
        
        this.setSize(640, 480);
        this.setVisible(true);
        
    }
    
public static void main(String[] args){
    
    JanelaBaskara jb = new JanelaBaskara();
    
   
    
    
}
    
}
