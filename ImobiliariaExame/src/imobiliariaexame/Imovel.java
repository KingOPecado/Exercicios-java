package imobiliariaexame;


public class Imovel {
    int codigo;
    char categoria;
    double aluguelBase;
    String situacao;

    public Imovel(int codigo, char categoria, double aluguelBase, String situacao) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.aluguelBase = aluguelBase;
        this.situacao = situacao;
    }
    
    
}
