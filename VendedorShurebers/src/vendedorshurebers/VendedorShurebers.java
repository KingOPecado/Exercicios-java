/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vendedorshurebers;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class VendedorShurebers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String nome;
        double salarioBase;
        double valorVendas;
        double salarioFinal;
        double percentualVendas = 0;
        
        
        System.out.println("Digite o seu nome:");
        nome = scan.next();
        
        System.out.println("Digite seu salário base:");
        salarioBase = scan.nextDouble();
        
        System.out.println("Digite o valor de suas vendas:");
        valorVendas = scan.nextDouble();
        
        if (salarioBase == 600){
            percentualVendas = valorVendas*0.05;        
        }
        if (salarioBase == 1000){
            percentualVendas = valorVendas*0.1;
        }
        if (salarioBase == 2000){
            percentualVendas = valorVendas*0.2;
        }
        salarioFinal = salarioBase + percentualVendas;
        
        System.out.println("O valor final de seu salário é: R$" + salarioFinal);
    }
    
}
