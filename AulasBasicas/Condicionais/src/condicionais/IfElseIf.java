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
public class IfElseIf {
    
public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço do produto");
        double preco = scan.nextDouble();
        
        if (preco <= 10){
            System.out.println("Está barato demais! Compre agora!");
        }else if (preco > 10 && preco <=15){
            System.out.println("Temos que negociar um desconto!");
        }else{
            System.out.println("Está muito caro!");
        }
   
}
}
