/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadeloka;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class IdadeLoka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.println("Digite o primeiro nome:");
        String nome1 = scan.next();
        
        System.out.println("Digite a sua idade:");
        int idade1 = scan.nextInt();
        
        System.out.println("Digite o outro nome:");
        String nome2 = scan.next();
        
        System.out.println("Digite a sua idade:");
        int idade2 = scan.nextInt();
        
        if (idade1 > idade2){
            System.out.println(nome1 + " é mais velho que " + nome2);
        }
        else{
            System.out.println(nome2 + " é mais velho que " + nome1);
        }
    }
    
}
