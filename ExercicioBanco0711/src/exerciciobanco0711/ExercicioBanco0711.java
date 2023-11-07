
package exerciciobanco0711;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExercicioBanco0711 {

    public static void main(String[] args) {
        
        try {
            ContaBancaria[] contas = lerDados();
            Scanner scan = new Scanner(System.in);

            int opcao = 0;
            int indexConta = -1;
          
            do {
                System.out.println(
                    "\nMenu\n" +
                    "1 - Saldo\n" +
                    "2 - Depósito\n" +
                    "3 - Saque\n" +
                    "4 - Sair\n" + 
                    "Digite uma opção: "
                );
                opcao = scan.nextInt();  
                          
                switch (opcao) {
                    case 1:
                        indexConta = login(contas);
                        if (indexConta != -1) {
                            System.out.println("\n" + contas[indexConta].exibirSaldo());
                        }
                        break;

                    case 2: 
                        indexConta = login(contas);
                        if (indexConta != -1) {
                            System.out.println("\nDigite o valor que deseja depositar: ");
                            double valorDeposito = scan.nextDouble();
                            contas[indexConta].efetuarDeposito(valorDeposito);
                        }
                        break;

                    case 3: 
                        indexConta = login(contas);
                        if (indexConta != -1) {
                            System.out.println("\nDigite o valor que deseja sacar: ");
                            double valorSaque = scan.nextDouble();
                            contas[indexConta].efetuarSaque(valorSaque);
                        } 
                        break;

                    case 4:
                        System.out.println("\nEncerrando Sistema...");
                        break;
                
                    default:
                        System.out.println("\nOpção Inválida!!!");
                        break;
                }
            } while (opcao != 4);
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static ContaBancaria[] lerDados() throws FileNotFoundException {
        File arq = new File("Dados.txt");

        Scanner scan = new Scanner(arq);

        ContaBancaria[] contas = new ContaBancaria[9];

        for (int i = 0; i < contas.length; i++) {
            contas[i] = new ContaBancaria(scan.nextInt(), scan.nextInt(), scan.next(), scan.nextDouble(), scan.nextDouble());
        }

        scan.close();

        return contas;
    }

    public static int verificarConta(ContaBancaria[] contas, int conta) {
        int index = -1;

        for (int i = 0; i < contas.length; i++) {
            if (conta == contas[i].getConta()) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static int login(ContaBancaria[] contas) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nDigite o número da conta: ");
        int contaDigitada = scan.nextInt();
        int indexConta = verificarConta(contas, contaDigitada);

        if (indexConta == -1) {
            System.out.println("\nConta Inexistente :(");
            return -1;
        } 

        System.out.println("\nDigite a senha da conta: ");
        int senhaDigitada = scan.nextInt();

        if (!contas[indexConta].verificaSenha(senhaDigitada)) {
            System.out.println("\nSenha Inválida :(");
            return -1;
        } 
        
        return indexConta;
    }

}
