/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosaula17;

import java.util.Scanner;

/**
 *
 * @author Isa Gb
 */
public class CardapioExerc32 {

    
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    boolean naoTerminar = true;
    int cod, qtd;
    double total=0;
    String output="";
    
    do{
        System.out.println("Cardápio: ");
        System.out.println("Descrição         -> Cód -> Preço ");
        System.out.println("  Cachorro Quente -> 100 -> R$ 1,20 ");
        System.out.println("  Bauru Simples   -> 101 -> R$ 1,30 ");
        System.out.println("  Bauru com Ovo   -> 102 -> R$ 1,50 ");
        System.out.println("  Hamburguer      -> 103 -> R$ 1,20 ");
        System.out.println("  Cheese Burguer  -> 104 -> R$ 1,30 ");        
        System.out.println("  Refrigerante    -> 105 -> R$ 1,00 ");

        System.out.println("Digite o código do produto desejado: (para sair digite 0) ");
        cod = scan.nextInt();
        System.out.println("Digite a quantidade desejada: (para sair digite 0) ");
        qtd = scan.nextInt();
        
        if (cod == 0 && qtd ==0){
            naoTerminar = false;
            output += "Total a pagar: R$ " + total;
        }else{
            if(cod == 100){
                output += "Cachorro Quente -> 1,20 * "+qtd;
                output += " = R$ " + (1.2*qtd) + "\n";
                total += 1.2*qtd;
            } else if (cod == 101){
                output += "Bauru Simples -> 1,30 * "+qtd;
                output += " = R$ " + (1.3*qtd) + "\n";
                total += 1.3*qtd;
            } else if (cod == 102){
                output += "Bauru com ovo -> 1,50 * "+qtd;
                output += " = R$ " + (1.5*qtd) + "\n";
                total += 1.5*qtd;
            } else if (cod == 103){
                output += "Harburguer -> 1,20 * "+qtd;
                output += " = R$ " + (1.2*qtd) + "\n";
                total += 1.2*qtd;
            } else if (cod == 104){
                output += "Cheese Burguer -> 1,30 * "+qtd;
                output += " = R$ " + (1.3*qtd) + "\n";
                total += 1.3*qtd;
            } else if (cod == 105){
                output += "Refrigerante -> 1,00 * "+qtd;
                output += " = R$ " + (1*qtd) + "\n";
                total += 1*qtd;
            }
        }
    }while(naoTerminar);
    
        System.out.println(output);
    }
   
}
