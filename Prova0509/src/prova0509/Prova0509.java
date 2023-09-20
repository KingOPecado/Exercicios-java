package prova0509;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prova0509 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char opcaoMenu;

        Vendedor[] vendedores;

        try {

            vendedores = lerDados();

            do {
                System.out.println("\nMenu\n"
                        + "1 - Exibir dados\n"
                        + "2 - Calcular salário\n"
                        + "3 - Calcular média\n"
                        + "4 - Sair\n"
                        + "Digite a opção desejada:");
                opcaoMenu = scan.next().charAt(0);
                System.out.println(System.lineSeparator());

                switch (opcaoMenu) {
                    case '1':
                        exibirDados(vendedores);
                        break;
                    case '2':
                        System.out.println("Digite o nome do funcionario: ");
                        String nomeDigitado = scan.next();

                        System.out.println("Resultado: " + Salario(vendedores, nomeDigitado));

                        break;

                    case '3':
                        System.out.println("Resultado: " + mediaVendas(vendedores));
                        break;
                }

            } while (opcaoMenu != '4');
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

    }

    public static Vendedor[] lerDados() throws FileNotFoundException {
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);

        Vendedor[] VendedoresArquivo = new Vendedor[8];

        for (int i = 0; i < VendedoresArquivo.length; i++) {
            VendedoresArquivo[i] = new Vendedor(scan.next(), scan.nextDouble(), scan.nextDouble());
        }
        return VendedoresArquivo;
    }

    public static void exibirDados(Vendedor[] vendedores) {

        for (int i = 0; i < vendedores.length; i++) {
            System.out.printf("%-14s %-14.2f %-14.2f\n",
                    vendedores[i].nome, vendedores[i].salarioBase, vendedores[i].valorVendas);
        }
    }

    public static double Salario(Vendedor[] vendedores, String Nome) {

        boolean achou = false;
        double retorno = 0;
        int indexNome = 0;

        for (int i = 0; i < vendedores.length; i++) {
            if (vendedores[i].nome.equals(Nome)) {

                if (vendedores[i].salarioBase == 600.00) {
                    retorno = vendedores[i].salarioBase + (vendedores[i].valorVendas * 0.05);
                }
                if (vendedores[i].salarioBase == 1000.00) {
                    retorno = vendedores[i].salarioBase + (vendedores[i].valorVendas * 0.07);
                }
                if (vendedores[i].salarioBase == 2000.00) {
                    retorno = vendedores[i].salarioBase + (vendedores[i].valorVendas * 0.1);
                }

            }
            

        }
        return retorno;
    }

    public static double mediaVendas(Vendedor[] vendedores) {

        double resultado = 0;
        double media = 0;

        for (int i = 0; i < vendedores.length; i++) {
            resultado = resultado + vendedores[i].valorVendas;

            media = resultado / 8;
        }

        return media;
    }
}
