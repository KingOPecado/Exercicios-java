import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {
            ArrayList<ContaBancaria> contas = lerDados();
            Scanner input = new Scanner(System.in);
            int opcao = 0;

            do {

                System.out.println(
                    "\nMenu\n" +
                    "1 – Saldo\n" +
                    "2 – Depósito\n" +
                    "3 – Saque\n" +
                    "4 – Sair" +
                    "Digite a opção desejada: "
                );
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("\nDigite o número da conta: ");
                        int idConta = input.nextInt();
                        int indexConta = haConta(contas, idConta);

                        if (indexConta == -1) {
                            System.out.println("\nConta inexistente.");
                        } else {
                            ContaBancaria conta = contas.get(indexConta);
                            System.out.println("\nDigite a senha da conta: ");
                            int senha = input.nextInt();
                            if (!conta.verificarSenha(senha)) {
                                System.out.println("\nSenha incorreta.");
                            } else {
                                conta.exibirSaldo();
                            }
                        }
                        break;

                    case 2:
                        System.out.println("\nDigite o número da conta: ");
                        int idConta = input.nextInt();
                        int indexConta = haConta(contas, idConta);

                        if (indexConta == -1) {
                            System.out.println("\nConta inexistente.");
                        } else {
                            ContaBancaria conta = contas.get(indexConta);
                            System.out.println("\nDigite a senha da conta: ");
                            int senha = input.nextInt();
                            if (!conta.verificarSenha(senha)) {
                                System.out.println("\nSenha incorreta.");
                            } else {
                                System.out.println("Digite o valor do depósito: ");
                            }
                        }
                        break;

                    case 3:

                        break;

                    case 4:
                        System.out.println("\nEncerrando o programa...");
                        break;

                    default:
                        System.out.println("\nOpção inválida.");
                        break;
                }

            } while (opcao != 4);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<ContaBancaria> lerDados() throws FileNotFoundException {
        File arquivo = new File("Dados.txt");
        Scanner scan = new Scanner(arquivo);
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        while (scan.hasNext()) {
            contas.add(new ContaBancaria(scan.nextInt(), scan.nextInt(), scan.next(), scan.nextDouble(), scan.nextDouble()));
        }

        return contas;
    }

    public static int haConta(ArrayList<ContaBancaria> contas, int id) {
        int indexConta = -1;

        for (int i = 0; i < contas.size(); i++) {
            if (id == contas.get(i).getId()) {
                indexConta = i;
                break;
            }
        }

        return indexConta;
    }

}