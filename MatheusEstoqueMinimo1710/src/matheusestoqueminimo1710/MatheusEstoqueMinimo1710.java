package matheusestoqueminimo1710;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatheusEstoqueMinimo1710 {

    public static void main(String[] args) {

        try {
            Produto[] produtos = lerDados();
            Scanner scan = new Scanner(System.in);
            int opcao;

            do {
                exibirDados(produtos);

                System.out.println(
                        "\nMenu\n"
                        + "1 – Efetuar venda\n"
                        + "2 – Verificar estoque\n"
                        + "3 – Sair\n"
                        + "Digite a opção desejada:"
                );
                opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("\nDigite o codigo: ");
                        int codigoDigitado = scan.nextInt();

                        int indexProduto = verificaCodigoValido(codigoDigitado, produtos);

                        if (indexProduto == -1) {
                            System.out.println("\nCodigo Invalido.\n");
                        } else {
                            System.out.println("\nDigite a quantidade a vender:");
                            int quantidadeCompra = scan.nextInt();
                            Produto produtoAVender = produtos[indexProduto];

                            if (produtoAVender.temEstoque(quantidadeCompra)) {
                                double totalAPagar = produtoAVender.vender(quantidadeCompra);
                                System.out.println("\nVenda Efetuada.\n");
                                System.out.println("Valor total a pagar: " + totalAPagar);
                            } else {
                                System.out.println("\nEstoque Insulficiente!!!!!!!!!!!!!!!\n");
                            }
                        }
                        break;

                    case 2:
                        System.out.printf("%n%-14s %-14s %n",
                                "Descrição", "Situação estoque");

                        for (Produto produto : produtos) {
                            System.out.printf("%-14s %-14s %n", produto.getDescricao(), produto.verificaSituacaoEstoque());
                        }
                        break;


                    case 3:
                        System.out.println("\nSistema Finalizado.\n");
                        break;

                    default:
                        System.out.println("\nOpção Invalida\n");
                        break;
                }

            } while (opcao != 3);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static Produto[] lerDados() throws FileNotFoundException {
        File arq = new File("Dados.txt");

        Scanner scan = new Scanner(arq);

        Produto produtos[] = new Produto[8];
        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = new Produto(scan.nextInt(), scan.next(), scan.nextInt(),
                    scan.nextInt(), scan.nextDouble());
        }

        return produtos;
    }

    public static void exibirDados(Produto[] produtos) {
        System.out.printf("%n%-14s %-14s %-14s %-14s %-14s %n", "Código", "Descrição", "Estoque", "Estoque Mínimo", "Preço Unitário");
        for (Produto produto : produtos) {
            System.out.printf("%-14d %-14s %-14d %-14d %-14.2f %n",
                    produto.getCodigo(),
                    produto.getDescricao(),
                    produto.getEstoque(),
                    produto.getEstoqueMinimo(),
                    produto.getPrecoUnitario()
            );
        }
    }

    public static int verificaCodigoValido(int codigo, Produto[] produtos) {

        int indexProduto = -1;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getCodigo() == codigo) {
                indexProduto = i;
                break;
            }
        }

        return indexProduto;
    }
}
