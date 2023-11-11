
package matheushenriqueprova0711;


public class Prestacao {
    private String cliente;
    private double valorBase;
    private int numeroPrestacoes;

    public Prestacao(String cliente, double valorBase, int numeroPrestacoes) {
        this.cliente = cliente;
        this.valorBase = valorBase;
        this.numeroPrestacoes = numeroPrestacoes;
    }
    
   public double calcularPrestacao(){
       
       double desconto = 0;
       double acrescimo = 0;
       if (numeroPrestacoes == 2) return valorBase/2;
       
       
       if (numeroPrestacoes == 1){
           desconto = (valorBase*0.05);
           return valorBase - desconto;
       } 
       
       if (numeroPrestacoes == 3) {
           acrescimo = (valorBase*0.05);
           return (valorBase + acrescimo)/3;
       }
           
       return 0;
   }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public int getNumeroPrestacoes() {
        return numeroPrestacoes;
    }

    public void setNumeroPrestacoes(int numeroPrestacoes) {
        this.numeroPrestacoes = numeroPrestacoes;
    }
}
