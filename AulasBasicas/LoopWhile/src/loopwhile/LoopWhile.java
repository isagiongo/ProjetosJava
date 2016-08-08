/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopwhile;

/**
 *
 * @author Isa Gb
 */
public class LoopWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 1;
        int max = 10;
        
        System.out.println("Contando até " + max);
        
        while (i <= max){
            System.out.println("Valor de i: " + i);
            i++;
        }

    }
    
}
