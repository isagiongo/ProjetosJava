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
public class CalculaHora {

public static void main (String[] args){
    
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Digite o valor de sua hora/aula: ");
    System.out.print("R$ ");
    
    double valorHora = ler.nextDouble();
    
    System.out.println("Digite quantas horas você trabalhou este mês: ");
    
    double quantHoras = ler.nextDouble();
    
    double salarioBruto = valorHora*quantHoras;
    double descImposto = salarioBruto*11/110;
    double descINSS = salarioBruto*8/100;
    
    System.out.println("Seu salário bruto será de aproximadamento R$ "+ salarioBruto);
    System.out.println("O desconto do Imposto de renda será de R$ "+ descImposto);
    System.out.println("O desconto do INSS será de R$ "+ descINSS);
    System.out.println("O salário líquido será de R$ "+ (salarioBruto - descINSS - descImposto));
    
}
    
}
