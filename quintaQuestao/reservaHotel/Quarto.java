

public class Quarto {
    private String categoria;
    private float valor = 0.0f;
    private String numeroQuarto;
    private boolean disponibilidade;
    
    public Quarto(String categoria, float valor, String numeroQuarto) {
        this.categoria = categoria;
        this.valor = valor;
        this.numeroQuarto = numeroQuarto;
        this.disponibilidade = true;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }
    
    public void reservar(){
        disponibilidade = false;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNumeroQuarto() {
        return numeroQuarto;
    }


}
