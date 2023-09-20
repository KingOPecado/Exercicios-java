/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
       
       int numero1;
       int numero2;
       
        System.out.println("Digite o primeiro número:");
        numero1 = scan.nextInt();
        
        System.out.println("Digite o segundo número:");
        numero2 = scan.nextInt();
        
        if(numero1 == numero2){
            System.out.println("OS números são iguais");
        }
        else{
            System.out.println("Os números são diferentes");
        }
    }
    
}
