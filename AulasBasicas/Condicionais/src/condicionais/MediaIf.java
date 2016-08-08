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
public class MediaIf {
    
public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite a primeira nota: ");
    double nota1 = scan.nextDouble();
    
    System.out.println("Digite a segunda nota: ");
    double nota2 = scan.nextDouble();
    
    double media = (nota1 + nota2)/2;
    System.out.println("A média é: "+media);
    
    if(media>=7){
        System.out.println("Você está aprovado!");
    }else{
        System.out.println("Você reprovou!");
    }

    
    
}
    
}
