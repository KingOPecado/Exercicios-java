
package clinicamedica2410;


public class Consulta {
    private String paciente;
    private int convenio;
    private double valorBase;
    private char categoria;

    public Consulta(String paciente, int convenio, double valorBase, char categoria) {
        this.paciente = paciente;
        this.convenio = convenio;
        this.valorBase = valorBase;
        this.categoria = categoria;
    }

    public double calcularValor(){
        if (categoria == 'r') return 0;
        if (convenio == 1) return valorBase;
        if (convenio == 2) return valorBase * 0.5;
        if (convenio == 3) return valorBase * 0.3;
        return 0;
    }
    

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public int getConvenio() {
        return convenio;
    }

    public void setConvenio(int convenio) {
        this.convenio = convenio;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
}
