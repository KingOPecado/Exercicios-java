/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glennmarcoscostalargapintosalario;

import java.util.Scanner;

/**
 *
 * @author Glenn
 */
public class GlennMarcosCostaLargaPintoSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        double aumento = 0;
        double salarioFinal;
        
        System.out.println("Digite o seu salario: ");
        double salario = scan.nextDouble();
        
        if(salario <= 2000){
            aumento = salario*0.1;
        }
        if((salario > 2000) && (salario <= 3000)){
            aumento = salario*0.05;
        }
        
        salarioFinal = salario + aumento;
        
        System.out.println("Seu novo salário é: R$" + salarioFinal);
        System.out.println("Aumento de R$" + aumento);
    }
    
}
