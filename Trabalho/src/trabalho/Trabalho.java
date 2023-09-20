/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        
        double salarioFinal;
        double horaTrabalho;
        
        System.out.printf("Digite suas horas trabalhadas: ");
        horaTrabalho = scan.nextDouble();
        
        salarioFinal = (17.8 * horaTrabalho * 0.91);
        
        System.out.printf("O salário gasoso do funcionario é: R$%.2f%n", salarioFinal);
    }
    
}
