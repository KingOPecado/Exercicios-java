
package glessmarcosmaiormenor;

import java.util.Scanner;

/**
 *
 * @author Gless Marcos, O Encomendador
 */
public class GlessMarcosMaiorMenor {

    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o 1º número: ");
        int numero = scan.nextInt();
        int maior = numero;
        int menor = numero;
        
        for (int i = 2; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número: ");
            numero = scan.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
                
    }
    
}
