/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetornota;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class VetorNota {

    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        int[] notas = new int[5];
        int maior = 0;
        int menor = 0;
        
        for (int i = 0; i < 5; i++){
            System.out.println("Digite a " + (i + 1) + "ª nota: " );
            notas[i] = scan.nextInt();
            
            if ( i == 0){
                maior = notas[i];
                menor = notas[i];
            }
            if( notas[i] < menor){
                menor = notas[i];
            }
            if( notas[i] > maior){
                maior = notas[i];
            }
        }
        
        System.out.println("as notas são: ");
        for (int i = 0; i < 5; i++){
        
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nMaior nota: " + maior);
        System.out.println("Menor nota: " + menor);
    }
    
}
