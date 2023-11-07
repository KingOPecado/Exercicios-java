package clinicamedica2410;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ClinicaMedica2410 {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            Consulta[] consultas = lerDados();

            int opcao = 0;

            do {
                System.out.println(
                    "\nMenu\n" +
                    "1 – Listar pacientes e valores\n" +
                    "2 – Porcentagem convênio\n" +
                    "3 – Sair\n" +
                    "Digite a opção desejada:"
                );
                opcao = scan.nextInt();

                switch (opcao){
                    case 1:
                        System.out.println("\nDigite o convênio: \n");
                        int convenio = scan.nextInt();
                        listarValores(consultas, convenio);
                        break;

                    case 2:
                        System.out.printf("\nPorcentagem de consultas com categoria R: %.1f%% \n", calcularPorcentagemRetorno(consultas));
                        break;

                    case 3:
                        System.out.println("\nEncerrando Sistema...\n");
                        break;

                    default:
                        System.out.println("\nOpcão invalida!!\n");
                        break;
                }
            } while (opcao != 3);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static Consulta[] lerDados() throws FileNotFoundException{
        File arq = new File("Dados");
        Scanner scan = new Scanner (arq);
        
        Consulta[] consultas = new Consulta[10];
        
        for (int i = 0; i < consultas.length; i++) {
            consultas[i] = new Consulta(scan.next(), scan.nextInt(),
                                             scan.nextDouble(), scan.next().charAt(0));
        }

        return consultas;
    }

    public static void listarValores(Consulta[] consultas, int convenio){
        boolean haConvenio = false;

        for (Consulta consulta : consultas) {
            if (convenio == consulta.getConvenio()) {
                haConvenio = true;
                System.out.printf("%-14s  %-14.2f %n", consulta.getPaciente(), consulta.calcularValor());
            }
        }

        if (!haConvenio){
            System.out.println("\nConvênio não encontrado");
        }
    }

    public static double calcularPorcentagemRetorno(Consulta[] consultas){
        int quantidade = 0;

        for (Consulta consulta: consultas) {
            if (consulta.getCategoria() == 'r'){
                quantidade++;
            }
        }

        return (double) quantidade / consultas.length * 100;
    }
}
