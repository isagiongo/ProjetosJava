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
public class MediaBimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double somaNotas;
    
        Scanner lerNotas = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = lerNotas.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = lerNotas.nextDouble();
    
        System.out.println("Digite a teceira nota: ");
        double nota3 = lerNotas.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        double nota4 = lerNotas.nextDouble();
        
        somaNotas = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("A média de notas é "+somaNotas);
    }
    
}
