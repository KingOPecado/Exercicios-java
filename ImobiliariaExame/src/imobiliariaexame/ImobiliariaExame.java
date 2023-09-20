package imobiliariaexame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImobiliariaExame {

    public static void main(String[] args) {
        File arq = new File("dados");

        try {
            lerDados();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void lerDados() throws FileNotFoundException {
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);
        
        Imovel[] imoveis = new Imovel[8];

        for (int i = 0; i < imoveis.length; i++) {
           imoveis[i] = new Imovel(scan.nextInt(), scan.next().charAt(0), scan.nextDouble(), scan.next());

           System.out.printf("%-14d %-14c %-14.2f %-14s\n",
           imoveis[i].codigo, imoveis[i].categoria, imoveis[i].aluguelBase, imoveis[i].situacao);
        }
       
    }
    
    public static void exibir(Imovel imoveis[]){
        for (int i = 0; i < imoveis.length; i++) {
          
           System.out.printf("%-14d %-14c %-14.2f %-14s\n",
           imoveis[i].codigo, imoveis[i].categoria, imoveis[i].aluguelBase, imoveis[i].situacao);
        }
    }

}
