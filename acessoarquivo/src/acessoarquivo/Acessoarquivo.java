package acessoarquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Acessoarquivo {

    public static void main(String[] args) {
        File arq = new File("Dados");
        
        int codigo[] = new int[8];
        String descricao[] = new String[8];
        int estoque[] = new int[8];
        int estoqueMinimo[] = new int[8];
        double precoUnit[] = new double[8];
        
        try {

            Scanner scan = new Scanner(arq);
            
            System.out.printf("%14s %14s %14s %14s %14s\n,"
                    + "");

            for (int i = 0; i < 8; i++) {
                
               codigo[i] = scan.nextInt();
               descricao[i] = scan.next();
               estoque[i] = scan.nextInt();
               estoqueMinimo[i] = scan.nextInt();
               precoUnit[i] = scan.nextDouble();
                
            

                System.out.printf("%14d %14s %14d %14d %14f\n",
               codigo[i] ,
               descricao[i],
               estoque[i],
               estoqueMinimo[i],
               precoUnit[i]   
                );
            }

        } catch (FileNotFoundException ex) {
            System.out.println("O arquivo não existe");
        }

    }

}
