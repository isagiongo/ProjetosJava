/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;

import java.util.Scanner;

/**
 *
 * @author Isa Gb
 */
public class SwitchCase {
    
public static void main (String[] args){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o número correspodente ao dia da semana que você deseja (de 1 a 7): ");
    
    int diaSemana = scan.nextInt();
    
    switch(diaSemana){
        case 1: System.out.println("Domingo"); break;
        case 2: System.out.println("Segunda"); break;
        case 3: System.out.println("Terça"); break;
        case 4: System.out.println("Quarta"); break;
        case 5: System.out.println("Quinta"); break;
        case 6: System.out.println("Sexta"); break;
        case 7: System.out.println("Sábado"); break;
        default: System.out.println("Não é um número válido");
        
    }
    
    
}
    
}
