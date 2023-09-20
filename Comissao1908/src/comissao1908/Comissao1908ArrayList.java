package comissao1908;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Comissao1908ArrayList {

    
    public static void main(String[] args) {
        File arq = new File("dados");
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        try(Scanner scan = new Scanner(arq)) {
            
            System.out.printf("%-14s %-14s %-14s %-14s\n", 
                    scan.next(), scan.next(), scan.next(), scan.next());
            
            while(scan.hasNext()) {
                funcionarios.add(new Funcionario(scan.next(), scan.nextDouble(), scan.nextDouble(), scan.next().charAt(0))); 
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado");
        }
        
        for (Funcionario funcionario : funcionarios) {
            System.out.printf("%-14s %-14.2f %-14.2f %-14c\n", 
                    funcionario.nomes, funcionario.salarioBase, funcionario.vendas, funcionario.categoria);
        }
    }
    
}
