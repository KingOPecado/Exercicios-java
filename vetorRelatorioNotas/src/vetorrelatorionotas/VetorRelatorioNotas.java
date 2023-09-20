/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorrelatorionotas;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class VetorRelatorioNotas {

    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        String[] nomes = new String[6];
        double[] notas1 = new double[6];
        double[] notas2 = new double[6];
        double[] medias = new double[6];
        String[] situacoes = new String[6];
        double somaMedia = 0;
        int totalAprovados = 0;
        int totalReprovados = 0;
        double mediaClasse;
        
        for (int i = 0; i < 6; i++){
            System.out.println("digite o nome do " + (i + 1) + "º aluno");
            nomes[i] = scan.next();
            
            System.out.println("digite a primeira nota");
            notas1[i] = scan.nextDouble();
            
            System.out.println("digite a segunda nota");
            notas2[i] = scan.nextDouble();
            
            medias[i] = (notas1[i] + notas2[i])/2;
            
            if ( medias[i] < 6){
                situacoes[i] = "reprovado";
                totalReprovados++;
            }
            else{
                situacoes[i] = "aprovado";
                totalAprovados++;
            }
        
            somaMedia += medias[i];
        }
            
            mediaClasse = somaMedia/6;
            
        for (int i = 0; i < 6; i++){
            System.out.println("aluno: " + nomes[i]);
            System.out.println("primeira nota: " + notas1[i]);
            System.out.println("segunda nota: " + notas2[i]);
            System.out.println("medias: " + medias[i]);
            System.out.println("situação: " + situacoes[i] + "\n");
        }
        
        System.out.println("A media da classe é: " + mediaClasse);
        System.out.println("A quantidade de aprovados é: " + totalAprovados);
        System.out.println("A quantidade de reprovados é: " + totalReprovados);

    }
    
}
