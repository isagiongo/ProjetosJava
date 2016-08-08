/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.util.Scanner;

/**
 *
 * @author Isa Gb
 */
public class LeituraDadosTeclado {
    
public static void main (String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    /*System.out.println("Digite seu nome completo: ");
    
    String nomeCompleto = scan.nextLine();
    
    System.out.println("Seu nome completo é: "+ nomeCompleto);
    
    System.out.println("Digite seu primeiro nome: ");
    
    String primeiroNome = scan.next();
    
    System.out.println("Seu primeiro nome é: "+ primeiroNome);
    
    System.out.println("Digite sua idade: ");
    int idade = scan.nextInt();
    System.out.println("Sua idade é: "+ idade);*/
    
    System.out.println("Digite seu primeiro nome, idade, altura e se tem pets: ");
    String primeiroNome = scan.next();
    int idade = scan.nextInt();
    float altura = scan.nextFloat();
    boolean temPet = scan.nextBoolean();
    
    System.out.println("Você digitou os seguintes valores: ");
    System.out.println("Primeiro Nome: "+primeiroNome);
    System.out.println("Idade: "+idade);
    System.out.println("Altura"+altura);
    System.out.println("Tem pets? " + temPet);
    
    }
    
}
