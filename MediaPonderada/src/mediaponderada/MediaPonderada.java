/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaponderada;

import java.util.Scanner;


/**
 *
 * @author Glenn
 */
public class MediaPonderada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float nota1;
        float nota2;
        float nota3;
        float peso1;
        float peso2;
        float peso3;
        float mediaPonderada;
        
        System.out.println("Digite a primeira nota:");
        nota1 = scan.nextFloat();
        
        System.out.println("Digite o primeiro peso:");
        peso1 = scan.nextFloat();
        
        System.out.println("Digite a segunda nota:");
        nota2 = scan.nextFloat();
        
        System.out.println("Digite o segundo peso:");
        peso2 = scan.nextFloat();
        
        System.out.println("Digite a terceira nota:");
        nota3 = scan.nextFloat();
        
        System.out.println("Digite o terceiro peso:");
        peso3 = scan.nextFloat();
        
        mediaPonderada = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
        
        System.out.printf("Sua media é : %ff", mediaPonderada);
        
        if(mediaPonderada >= 6)
        {
          System.out.println("\n Você está aprovado");  
        }
        else{
           System.out.println("\n Você está reprovado seu fudido");
        }
    }
    
}
