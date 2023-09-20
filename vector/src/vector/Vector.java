/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Vector {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
       
        int[] numero = new int[10];
        int soma = 0;
        
        for (int i = 0; i < 10; i++){
        
            System.out.println("insira o " + (i + 1) + "º numero: ");
            numero[i] = scan.nextInt();
            soma += numero[i]; 
        }
        
        System.out.println("soma: " + soma);
    }
    
}
