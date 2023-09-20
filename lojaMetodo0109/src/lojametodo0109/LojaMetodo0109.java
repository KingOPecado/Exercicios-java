package lojametodo0109;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LojaMetodo0109 {

    public static Produto[] produtos;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char opcaoMenu;

        try {
            produtos = lerDados();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

        do {
            System.out.println("\nMenu\n"
                    + "1 - Exibir dados\n"
                    + "2 - Realizar compra\n"
                    + "3 - Sair\n"
                    + "Digite a opção desejada:");
            opcaoMenu = scan.next().charAt(0);
            System.out.print(System.lineSeparator());

            switch (opcaoMenu) {
                case '1':
                    exibirDados(produtos);
                    break;

                case '2':
                    System.out.println("Digite o codigo do produto desejado: ");
                    int codigoDigitado = scan.nextInt();
                    System.out.println("Digite a quantidade a ser comprada:");
                    int quantidadeDigitada = scan.nextInt();
                    efetuarCompra(codigoDigitado, quantidadeDigitada);
                    System.out.println("\nCompra Efetuada");
                    break;
            }

        } while (opcaoMenu != '3');
    }

    public static Produto[] lerDados() throws FileNotFoundException {
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);

        Produto[] produtosArquivo = new Produto[5];

        for (int i = 0; i < produtosArquivo.length; i++) {
            produtosArquivo[i] = new Produto(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextDouble());
        }
        return produtosArquivo;
    }

    public static void exibirDados(Produto[] produtos) {

        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("%-14d %-14s %-14d %-14.2f\n",
                    produtos[i].codigo, produtos[i].descircao, produtos[i].estoque, produtos[i].precoCompra);
        }
    }

    public static void efetuarCompra(int codigo, int quantidadeCompra) {

        boolean achou = false;
        int indexProdutoComprar = 0;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].codigo == codigo) {
                achou = true;

                indexProdutoComprar = i;
            }
        }

        if (achou) {
            produtos[indexProdutoComprar].estoque += quantidadeCompra;
        } else {
            System.out.println("\nCodigo invalido");
        }
    }
}
