
package lojavendedores;

public class Vendedor {
    private String nome;
    private double salarioBase;
    private double vendas;
    private char categoria;

    public Vendedor(String nome, double salarioBase, double vendas, char categoria) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.categoria = categoria;
    }

    public double calcularSalarioFinal() {
        if (categoria == 'e') return salarioBase + (vendas * 0.5);
        if (categoria == 'b') return salarioBase + (vendas * 0.2);    
        return salarioBase;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
}
