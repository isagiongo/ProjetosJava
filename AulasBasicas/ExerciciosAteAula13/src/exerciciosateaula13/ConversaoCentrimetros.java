/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosateaula13;

import java.util.Scanner;

/**
 *
 * @author Isa Gb
 */
public class ConversaoCentrimetros {
    
public static void main (String[] args){
    
    Scanner ler = new Scanner(System.in);
    double valorCentimetros;
    
    System.out.println("Digite o valor em metros que deseja converter para centímetros: ");
    double valorMetros = ler.nextDouble();
    
    valorCentimetros = valorMetros * 100;
    
    System.out.println("O valor de "+valorMetros+" metros em centímetros é "+ valorCentimetros+" centrímetros");
    
}
    
}
