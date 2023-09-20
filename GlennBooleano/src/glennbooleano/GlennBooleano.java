/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package glennbooleano;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class GlennBooleano {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int opcao;
        double[] numeros = {1, 2.5, 3, 4.9, 5.8, 6.3, 7, 8.5, 9, 10};
        double soma = 0;
        double media = 0;
        
        do{
            System.out.printf(" %s%n %s%n %s%n %s%n", 
                    "Menu", 
                    "1 - Soma dos numeros", 
                    "2 - Media dos numeros", 
                    "3 - Sair");
            opcao = scan.nextInt();
            
            switch (opcao){
                    case 1:
                        soma = 0;
                        for (int i = 0; i < 10; i++) {
                            soma += numeros[i];
                        }
                        System.out.println("Soma dos números "+ soma);
                        break;
                    case 2:
                        soma = 0;
                        for (int i = 0; i < 10; i++) {
                         soma += numeros[i];
                        }
                        media = soma/numeros.length;
                        System.out.println("Media dos números " + media);
                        break;
                    case 3:
                        System.out.println("Terminou");
                        break;
                    default:
                        System.out.println("Opção invalida, digite novamente");
                        break;
            }                
        }while(opcao != 3); 
        
        
    }
    
}
