/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author Isa Gb
 */
public class OperadoresRelacionais {
    
public static void main (String[] args){
    
    int valor1;
    int valor2;
    
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    valor1 = ler.nextInt();
    System.out.println("Digite o segundo número: ");
    valor2 = ler.nextInt();
    
    System.out.println("O número "+valor1+" é == ao número "+ valor2 +" : "+(valor1 == valor2));
    System.out.println("O número "+valor1+" é != ao número "+ valor2 +" : "+(valor1 != valor2));
    System.out.println("O número "+valor1+" é > ao número "+ valor2 +" : "+(valor1 > valor2));
    System.out.println("O número "+valor1+" é < ao número "+ valor2 +" : "+(valor1 < valor2));

}
    
}
