/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopfor;

/**
 *
 * @author Isa Gb
 */
public class LoopFor {

    public static void main(String[] args) {
        for (int i=0; i <= 5; i++){
            
            System.out.println("O i tem valor de: (Incrementando)"+ i);
        }
        for (int i=5; i > 0; i--){
            
            System.out.println("O i tem valor de: (Decrementando)"+ i);
        }
        for (int i=0, j=10; i<=j; i++, j--){
            
            System.out.println("i= "+i+"; j= "+j);
        }
        
        int soma=0;
        for (int i=1;i<5;soma += i++);
        System.out.println("O valor da soma é: "+soma);
    
    }
    
}
