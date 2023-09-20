/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investimento;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Investimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double rendimento = 0;
        double valorFinal= 0;
        
        System.out.printf("%s%n%s%n%s%n", 
                          "Escolha o tipo de investimento desses abaixo: ",
                          "1 - poupança 3%",
                          "2 - renda fixa 4%");
        
        int tipo = scan.nextInt();
        
        System.out.println("Digite o valor a ser investido");
        double valor = scan.nextDouble();
        
        if (tipo == 1){
          rendimento = valor*0.03;
        }
        if (tipo == 2){
            rendimento = valor*0.04;
        } 
        
        valorFinal = rendimento + valor;
        System.out.println("O valor corrigido é R$: " + valorFinal);
    }
    
}
