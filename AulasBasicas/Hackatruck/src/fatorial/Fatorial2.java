/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

/**
 *
 * @author Isa Gb
 */
public class Fatorial2 {
    
	public static void main (String args[]) {
		for(int i=0; i<=10;i++) {
			System.out.println(i + "! = " + fatorial(i));
		}
	}
	public static int fatorial(int num) {
		if (num <=1 )  return 1;
		else  return num * fatorial(num - 1);
	}
}
    

