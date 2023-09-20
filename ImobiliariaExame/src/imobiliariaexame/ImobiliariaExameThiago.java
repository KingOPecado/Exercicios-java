package imobiliariaexame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImobiliariaExameThiago {    
    
    public static void main(String[] args) {

        File arq = new File("dados");

        try {
           ArrayList<Imovel> imoveis = lerDados(arq); 
           
            System.out.printf("%-14s %-14s %-14s %-14s\n", "Código", "Categoria", "Aluguel Base", "Situação");
            for (int i = 0; i < imoveis.size(); i++) {
                System.out.printf("%-14d %-14c %-14.2f %-14s\n",
                        imoveis.get(i).codigo, imoveis.get(i).categoria, imoveis.get(i).aluguelBase, imoveis.get(i).situacao);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado");
        }
    }
    
    public static ArrayList lerDados(File arquivo) throws FileNotFoundException {
        Scanner scan = new Scanner(arquivo);
        ArrayList<Imovel> imoveis = new ArrayList<>();
        
        while (scan.hasNext()) {
            imoveis.add(new Imovel(scan.nextInt(), scan.next().charAt(0), scan.nextDouble(), scan.next()));
        }
        
        return imoveis;
    }

}
