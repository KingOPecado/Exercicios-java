package comissao1908;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Comissao1908 {

    
    public static void main(String[] args) {
        File arq = new File("dados");
        
        Funcionario funcionarios[] = new Funcionario[7];
        
        try {
            Scanner scan = new Scanner(arq);
            
            System.out.printf("%-14s %-14s %-14s %-14s\n", 
                    scan.next(), scan.next(), scan.next(), scan.next());
            
            for (int i = 0; i < funcionarios.length; i++) {
                
                funcionarios[i] = new Funcionario(scan.next(), scan.nextDouble(), scan.nextDouble(), scan.next().charAt(0));
                
                System.out.printf("%-14s %-14.2f %-14.2f %-14c\n", 
                        funcionarios[i].nomes, funcionarios[i].salarioBase, funcionarios[i].vendas, funcionarios[i].categoria);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
    }
    
}
