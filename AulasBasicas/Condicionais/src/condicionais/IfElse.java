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
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scan.nextInt();
        
        if (idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("É menor de idade");
        }
       

    }
    
}
