public class Main {
    public static void main(String[] args) {

        Integer[] inteiros = {5, 1, 8, 6, 4, 9, 3, 2, 7};
        Main.<Integer>printArray(inteiros);

        System.out.println("\n");
        
        Integer[] inteirosSortado = bubbleSort(inteiros);
        Main.<Integer>printArray(inteirosSortado);

    }

    public static Integer[] bubbleSort(Integer[] array) {
        int aux = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        return array;
    }

    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}