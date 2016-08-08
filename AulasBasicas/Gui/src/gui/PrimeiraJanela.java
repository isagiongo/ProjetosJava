/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author Isa Gb
 */
public class PrimeiraJanela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Frame janela = new Frame();
    janela.setTitle("Janelínea Javínea");
    
    Button btCentro = new Button("Centro");
    Button btNorte = new Button("Norte");
    Button btSul = new Button("Sul");
    Button btLeste = new Button("Leste");
    Button btOeste = new Button("Oeste");

    btCentro.setBackground(Color.lightGray);
    btCentro.setForeground(Color.red);
    
    janela.add(btCentro,BorderLayout.CENTER);
    janela.add(btNorte,BorderLayout.NORTH);
    janela.add(btSul,BorderLayout.SOUTH);
    janela.add(btLeste,BorderLayout.EAST);
    janela.add(btOeste,BorderLayout.WEST);
                
    
    janela.setSize(640, 480);
    janela.setVisible(true);

    
    }
    
}
