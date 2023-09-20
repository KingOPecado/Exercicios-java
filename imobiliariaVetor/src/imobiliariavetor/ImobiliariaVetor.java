/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliariavetor;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ImobiliariaVetor {


    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int[] codigo = {110, 112, 130, 114, 119, 150, 160, 164};
        char[] tipo = {'r', 'g', 'r', 'r', 'c', 'g', 'c', 'r'};
        double[] aluguel = {400, 800, 600, 300, 1500, 1100, 100, 900};
        int[] status = {1, 1, 2, 1, 2, 1, 1, 2};
        
        System.out.printf("%10s %10s %10s %10s%n", "Código", "Tipo", "Alugel", "Status");
        System.out.println("    ---------------------------------------");
        for (int i = 0; i < codigo.length; i++){
            System.out.printf("%10d %10c %10.2f %10d\n", codigo[i], tipo[i], aluguel[i], status[i]);
       
        }
        
        double soma = 0;
        double media;
        int contador = 0;
    
        for (int i = 0; i < codigo.length; i++){
            if(status[i] == 1){
                soma = soma + aluguel[i];
                contador++;
            }
        }   
    
        media = soma / contador;
        System.out.println("\n A media é R$: " + media);
        
        int contadorTipoR = 0;
        int contadorTipoG = 0;
        int contadorTipoC = 0;
        double porcentagemTipoR = 0;
        double porcentagemTipoG = 0;
        double porcentagemTipoC = 0;
        
        for (int i = 0; i < codigo.length; i++){
            if (tipo[i] == 'r'){
                contadorTipoR++;
            }
            else if (tipo[i] == 'g'){
                contadorTipoG++;
            }
            else {
                contadorTipoC++;
            }
        }
        
        porcentagemTipoR = (double) contadorTipoR/codigo.length * 100;
        porcentagemTipoG = (double) contadorTipoG/codigo.length * 100; 
        porcentagemTipoC = (double) contadorTipoC/codigo.length * 100;
        
        System.out.printf("%n Preço Residencial: R$%.2f", porcentagemTipoR);
        System.out.printf("%n Preço Galpões: R$%.2f", porcentagemTipoG);
        System.out.printf("%n Preço Comercial: R$%.2f %n %n", porcentagemTipoC);
        
        int codigoI;
        double aluguelFinal = 0;
        System.out.println("Digite o Códido de um imóvel:");
        codigoI = scan.next().charAt(0);
        for (int i = 0; i < codigo.length; i++){
            switch(codigoI) {
                case 'r':
                    aluguelFinal = aluguel[i] + aluguel[i] * 0.05;
                    break;
                case 'g':
                    aluguelFinal = aluguel[i] + aluguel[i] * 0.10;
                    break;
                case 'c':
                    aluguelFinal = aluguel[i] + aluguel[i] * 0.20;
                    break;
                default: 
                    aluguelFinal = 0;
                    break;
            }
        }
        
        System.out.println("\n O aluguel final é: R$ " + aluguelFinal);
    }   
}  



//
//
//    
//
