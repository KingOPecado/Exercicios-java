import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        System.out.println("O valor do desconto é:" +80*0.05);

        System.out.println("A porcentgem de aumento é:" +100*200/3000+ "%");

        System.out.println("O auento em porcentagem é:" +((4200*100/4000)-100)+ "%");


        double salarioAntigo = 4000, salarioNovo = 4200, perc;
        perc = ((salarioNovo - salarioAntigo)/salarioAntigo*100);

        System.out.println(perc+"$");
    }
                    }