
package vetorreais;

import java.util.Scanner;

/**
 *
 * @author "GLENN"
 */
public class VetorReais {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double[] reais = new double[8];
        double menorNumero = 0;
        
        System.out.println("Digite o 1� n�mero: ");
        reais[0] = scan.nextDouble();
        menorNumero = reais[0];
        
        for (int i = 1; i <= reais.length - 1; i++){
            System.out.println("digite o " + (i + 1) + "� n�mero");
            reais[i] = scan.nextDouble();
            
            if (reais[i] < menorNumero) {
                menorNumero = reais[i];
            }
        }
        
        System.out.print("\nN�meros: ");
        for (int i = 0; i < reais.length; i++) {
            System.out.print(reais[i] + " ");
        }
        System.out.println("\n\nMENOR:" + menorNumero);
    }
}
