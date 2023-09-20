package calculadorametodo2208;

import java.util.Scanner;


public class CalculadoraMetodo2208 {

    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

        double a;
        double b;
        double result;
        char operador;

        do {
            System.out.println("\nMenu\n"
                    + "+\n"
                    + "-\n"
                    + "*\n"
                    + "/\n"
                    + "s para sair\n"
                    + "Digite a operação :");
            operador = scan.next().charAt(0);
            
            switch (operador) {
                case '+':
//                    result = a + b;
//                    System.out.println("Soma:" + result);
                    
//                      somar1(); lê, processa, exibe é void
                    
//                    System.out.println("Resultado: " + somar2()); lê e processa, não é void usa return sem parametros
                    
//                    somar3(a, b); processa é exibe tem parametros é void
                    System.out.println("Digite o primeiro número");
                    a = scan.nextDouble();
          
                    System.out.println("Digite o segundo número");
                    b = scan.nextDouble();
                    
                    System.out.println("Resultado: " + somar4(a, b)); 
//                    processa, não void, possiu parametro
                    break;
                case '-':
                    
                    System.out.println("Digite o primeiro número");
                    a = scan.nextDouble();
          
                    System.out.println("Digite o segundo número");
                    b = scan.nextDouble();
                    
                    System.out.println("Resultado: " + subtrair4(a, b));
                    
                    break;
                
                case '*':
                    
                    System.out.println("Digite o primeiro número");
                    a = scan.nextDouble();
          
                    System.out.println("Digite o segundo número");
                    b = scan.nextDouble();
                    
                    System.out.println("Resultado: " + multiplicacao4(a, b));
                    
                    break;

            }

        } while (operador != 's');

    }
    
//    public static void somar1() {
//        double a;
//        double b;
//        double result;
//        
//        System.out.println("Digite o primeiro número");
//        a = scan.nextDouble();
//        System.out.println("Digite o segundo número");
//        b = scan.nextDouble();
//        
//        result = a + b;
//        
//        System.out.println("Soma : " + result);    
//    }
//    
//    public static double somar2() {
//        double a;
//        double b;
//        double result;
//        
//        System.out.println("Digite o primeiro número");
//        a = scan.nextDouble();
//        System.out.println("Digite o segundo número");
//        b = scan.nextDouble();
//        
//        result = a + b;
//        return result;
//    }
//    
//    public static void somar3(double x, double y){
//        
//        double result;
//        result = x + y;
//        System.out.println("Resultado: " + result);
//        
//    }
    
    public static double somar4(double x, double y){
        double result;
        
        result = x + y;
        
        return result;
        
    }
    
    public static double subtrair4(double x, double y){
        double result;
        
        result = x - y;
        
        return result;
    }
    
    public static double multiplicacao4(double x, double y){
        double result;
        
        result = x * y;
        
        return result;
    }
    
    public static boolean eZero(double y){
        return y==0;
    }

}
