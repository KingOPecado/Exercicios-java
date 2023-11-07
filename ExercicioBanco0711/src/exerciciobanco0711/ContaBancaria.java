
package exerciciobanco0711;


public class ContaBancaria {
    private int conta;
    private int senha;
    private String cliente;
    private double saldo;
    private double limiteEspecial;

    public ContaBancaria(int conta, int senha, String cliente, double saldo, double limiteEspecial) {
        this.conta = conta;
        this.senha = senha;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
    }
    
    public boolean verificaSenha(int senha){
       return senha == this.senha;
    }
    
    public String exibirSaldo(){
        return String.format("\nCliente: %s | Saldo: %.2f | Limite Especial: %.2f", cliente, saldo, limiteEspecial);
    }
    
    public void efetuarSaque(double valorSaque) {
        if (valorSaque > saldo + limiteEspecial) {
            System.out.println("\nSaldo Insulficiente");
            return;
        }

        if (valorSaque > saldo) {
            double valorLimite = valorSaque - saldo;
            saldo = 0;
            limiteEspecial -= valorLimite;
            System.out.println("\nSaque efetuado com sucesso");
            return;
        }
        
        saldo -= valorSaque;
        System.out.println("\nSaque efetuado com sucesso");
    }
    
    public void efetuarDeposito(double valorDeposito) {
          saldo += valorDeposito;
          System.out.println("\nDepósito efetuado com sucesso");
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
}
