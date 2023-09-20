/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azulejo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Azulejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double comprimento;
        double largura;
        double altura;
        double area;
        double caixa;
        
        System.out.println("Digite o comprimento: ");
        comprimento = scan.nextDouble();
        
        System.out.println("Digite a largura: ");
        largura = scan.nextDouble();
        
        System.out.println("Digite a altura: ");
        altura = scan.nextDouble();
        
        area = ((largura*altura)*2)+((altura*comprimento)*2);
        caixa = (int) Math.round((area/1.5));
        
        System.out.println("O total de caixas é:" + caixa);
     
    }
    
}
