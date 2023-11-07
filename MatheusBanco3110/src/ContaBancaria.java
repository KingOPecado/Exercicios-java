public class ContaBancaria {
    private int id;
    private int senha;
    private String cliente;
    private double saldo;
    private double limiteEspecial;

    public ContaBancaria(int conta, int senha, String cliente, double saldo, double limiteEspecial) {
        this.id = conta;
        this.senha = senha;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
    }

    public boolean verificarSenha(int senha){
        return senha == this.senha;
    }

    public String exibirSaldo(){
        return String.format("Cliente: %s | Saldo: %.2f", cliente, saldo);
    }

    public void realizarSaque(double valorSaque){
        if (saldo + limiteEspecial < valorSaque) {
            System.out.println("Saldo insuficiente :(");
            return;
        }

        saldo -= valorSaque;
        System.out.println("Saque efetuado com sucesso :)");
    }

    public void realizarDeposito(double valorDeposito){
        saldo += valorDeposito;
        System.out.println("Depósito efetuado com sucesso :)");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


