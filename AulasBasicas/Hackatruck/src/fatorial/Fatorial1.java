/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

import java.util.Scanner;

/**
 *
 * @author Isa Gb
 */
public class Fatorial1 {
    
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int num, cont, fat = 1;
        
        System.out.println("Digite o número que quer calcular o fatorial: ");
        
        num = ler.nextInt();
        
        System.out.print(num+"! = ");
        
        for (cont=1; cont <= num; cont++){
            
            fat = fat * cont;
            
            if(cont<num)
                System.out.print(cont+"*");
            else
                System.out.print(cont+" = ");
            
        }
        
        System.out.println(fat);
        }
        
    }
    

