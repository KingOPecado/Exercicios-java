package loja1808;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loja1808 {

    public static void main(String[] args) {
        File arq = new File("Produtos");

        Produto produtos[] = new Produto[3];

        try {
            Scanner scan = new Scanner(arq);
            System.out.printf("%-14s %-14s %14s\n", scan.next(), scan.next(), scan.next());

            for (int i = 0; i < produtos.length; i++) {
                produtos[i] = new Produto(scan.next(), scan.nextInt(), scan.nextDouble());

                System.out.printf("%-14s %-14d %14.2f\n",
                        produtos[i].descricao, produtos[i].quantidadeEstoque, produtos[i].precoUnitario);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
    }
}
