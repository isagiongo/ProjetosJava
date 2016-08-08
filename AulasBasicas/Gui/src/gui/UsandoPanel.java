/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author Isa Gb
 */
public class UsandoPanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Frame janela = new Frame();
    janela.setTitle("Janelínea Javínea");
    
    
    Button bt1 = new Button("bt1");
    Button bt2 = new Button("bt2");
    Button bt3 = new Button("bt3");
    Button bt4 = new Button("bt4");
    Button bt5 = new Button("bt5");

    Panel pNorte = new Panel();
    pNorte.add(bt1);
    pNorte.add(bt2);
    
    
    janela.add(pNorte, BorderLayout.NORTH);
    janela.add(bt3, BorderLayout.CENTER);
    janela.add(bt4, BorderLayout.SOUTH);
                
    
    janela.setSize(640, 480);
    janela.setVisible(true);

    
    }
    
}
