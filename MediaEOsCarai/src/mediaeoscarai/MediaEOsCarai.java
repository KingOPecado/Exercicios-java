
package mediaeoscarai;

import java.util.Scanner;

/**
 *
 * @author Gless
 */
public class MediaEOsCarai {

    public static void main(String[] args) {
        
        int soma = 0;
        int somaImpares = 0;
        int quantImpares = 0;
        double media = 0;
        double mediaImpares = 0;
        
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();
            
            soma += numero;
            
            if (numero % 2 != 0) {
                
                quantImpares++;
                somaImpares += numero;
                 
            }
            
        }
        
        media = (soma / 5.0);
        System.out.printf("Média total: %.1f%n", media);
        
        try {
            
            mediaImpares = (double) (somaImpares / quantImpares);
            System.out.printf("Média de ímpares: %.1f%n", mediaImpares);
            
        } catch (ArithmeticException e) {
            
            System.out.println("Não há números ímpares");
            
        }
        
    }
    
}
