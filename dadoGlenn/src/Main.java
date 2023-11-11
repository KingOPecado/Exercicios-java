import java.util.Map;

import java.util.HashMap;


public class Main {

    public static final int TOTAL_LADOS_DADO = 6;
    public static final int QUANTIDADE_ROLAGENS = 6000;
    public static void main(String[] args) {

        Map<Integer, Integer> ladosDado = new HashMap<>();

        // Cria os lados do dado
        for (int i = 1; i <= TOTAL_LADOS_DADO; i++) {
            ladosDado.put(i, 0);
        }

        // Rola o dado
        for (int i = 1; i <= QUANTIDADE_ROLAGENS; i++) {
            int lado = (int) Math.round(generateRandomNumber(1, TOTAL_LADOS_DADO));
            ladosDado.put(lado, ladosDado.get(lado) + 1);
            System.out.print(lado + " ");
        }

        System.out.println("\n");


        // Mostra quantas vezes caiu cada lado
        for (int i = 1; i <= TOTAL_LADOS_DADO; i++) {
            System.out.printf("Lado %d: %d \n", i, ladosDado.get(i));
        }


    }

    public static double generateRandomNumber(int min, int max) {
        return Math.random() * (max - min) + min;
    }

}