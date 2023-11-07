
package matheusestoqueminimo1710;


public class Produto {
    
    private int codigo;
    private String descricao;
    private int estoque;
    private int estoqueMinimo;
    private double precoUnitario;

    public Produto(int codigo, String descricao, int estoque, int estoqueMinimo, double precoUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.estoque = estoque;
        this.estoqueMinimo = estoqueMinimo;
        this.precoUnitario = precoUnitario;
    }
    
    public boolean temEstoque(int quantidadeVender) {
       return estoque >= quantidadeVender;
    }
    
    public double vender(int quantidade){
        if (!temEstoque(quantidade)) return 0;      
        
        estoque -= quantidade;
        double valorFinal = quantidade * precoUnitario;
        
        return valorFinal;
    }
    
    public String verificaSituacaoEstoque(){
        if (estoque > estoqueMinimo) return "Estoque Normal"; 
        if (estoque < estoqueMinimo) return "Estoque Baixo"; 
        return "Estoque Crítico";
    }
    
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
}
