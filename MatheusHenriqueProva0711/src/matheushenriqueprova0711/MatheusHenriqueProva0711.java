package matheushenriqueprova0711;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatheusHenriqueProva0711 {

   
    public static void main(String[] args) {
        try {
            Prestacao[] prestacoes = lerDados();
            Scanner scan = new Scanner(System.in);
            
            int opcao = 0;
            
            
            do {    
                exibirDados(prestacoes);
                
                System.out.println(
                        "\nMenu\n" +
                        "1 – Valor a receber\n" +
                        "2 – Total caixa\n" +
                        "3 – Maior valor base\n" +
                        "4 – Sair\n" +
                        "\nDigite a opção desejada:");
                        opcao = scan.nextInt();
                        
                switch(opcao){
                    case 1:
                        System.out.println("\nDigite o nome do cliente");
                        String nomeDigitado = scan.next();
                       
                        int achou = 1;
                        for (int i = 0; i < prestacoes.length; i++) {
                            if (nomeDigitado.equalsIgnoreCase(prestacoes[i].getCliente())) {
                                achou = 2;
                                
                                System.out.println("O valor a ser pago é: " + prestacoes[i].calcularPrestacao());
                            }
                        }
                        if (achou == 1) {
                            System.out.println("Cliente não encontrado :(");
                        }
                        
                        break;
                        
                    case 2:
                        double totalCaixa = 0;
                         for (int i = 0; i < prestacoes.length; i++) {
                            totalCaixa = 150+ prestacoes[i].calcularPrestacao();
                        }
                         System.out.println("O valor a pagar é" + totalCaixa);
                       break;
                       
                        
                    case 3:
                        System.out.println("\nO cliente com maior Valor Base é: \n" + clienteMaior(prestacoes));
                        break;
                    
                    case 4:
                        System.out.println("\nEncerrando o Sistema\n");
                        break;
                        
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
                       
            } while (opcao != 4);
               
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static Prestacao[] lerDados() throws FileNotFoundException{
        File arq = new File("Dados");
        
        Scanner scan = new Scanner(arq);
        
        Prestacao[] prestacoes = new Prestacao[8];
        
        for (int i = 0; i < prestacoes.length; i++) {
            prestacoes[i] = new Prestacao(scan.next(), scan.nextDouble(), scan.nextInt());
        }
        return prestacoes;
    }
    
    public static void exibirDados(Prestacao[] prestacoes){
        System.out.printf("%n%-14s %-14s %-14s %n", "Cliente", "ValorBase", "NúmeroPrestações");
        
        for (Prestacao prestacao : prestacoes) {
            System.out.printf("%-14s %-14.2f %-14d %n",
                    prestacao.getCliente(), prestacao.getValorBase(),
                    prestacao.getNumeroPrestacoes()); 
        }
    }
    
    public static String clienteMaior(Prestacao[] prestacoes){
        int valorMaior = 0;
        String nomeMaior = null;
        for (int i = 0; i < prestacoes.length; i++) {
            if (prestacoes[i].getValorBase()> valorMaior) {
                valorMaior = (int) prestacoes[i].getValorBase();
                nomeMaior = prestacoes[i].getCliente();
            }
        }
        return nomeMaior;
    }
    
    
}
