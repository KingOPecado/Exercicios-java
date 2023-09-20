/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import java.util.Scanner;



/**
 *
 * @author aluno
 */
public class Gato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        float sacoPeso;
        float gato1;
        float gato2;
        float quantidadeFinal;
        
        System.out.println("Digite o peso do saco:");
        sacoPeso = scan.nextFloat();
        
        System.out.println("POR FAVOR, digite o quanto o seu primeiro gato come:");
        gato1 = scan.nextFloat();
        
        System.out.println("POR FAVOR, digite o quanto o seu segundo gato come:");
        gato2 = scan.nextFloat();
        
        quantidadeFinal = sacoPeso-(5*(gato1+gato2)/1000);
        
        System.out.printf("A quantidade de ração restante depois de 5 dias é : %f", quantidadeFinal);
    }
    
}
