
package triangulo1909;

import javax.swing.JOptionPane;

public class Triangulo1909 {

    public static void main(String[] args) {
        
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado: ")); 
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado: ")); 
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado: ")); 
                                                                                                                                                                            
        if (!isTriangle(lado1, lado2, lado3)) {
            JOptionPane.showMessageDialog(null, "Não é um triângulo :(");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Tipo do triângulo: " + getTriangleType(lado1, lado2, lado3));
        JOptionPane.showMessageDialog(null, "Área do triângulo: " + String.format("%.2f", getTriangleArea(lado1, lado2, lado3)) + "cm²");
    }
    
    
    public static boolean isTriangle(double a, double b, double c) {
        return ((a < b + c) && (b < a + c) && (c < a + b));
    }
    
    
    public static String getTriangleType(double a, double b, double c) {
        if (a == b && a == c) return "Equilátero";
        if (a == b || a == c || b == c) return "Isósceles";
        return "Escaleno";
    }
    
    public static double getTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
}
