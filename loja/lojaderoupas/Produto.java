package questao3.lojaderoupas;

public class Produto {

    /*
     * Atributos
     */
    private String tamanho;
    private String cor;
    private double preco;
    private String nomePeca;

    /*
     * Construtor
     * Quando a classe for instanciada, será necessário passar o tamanho, a cor, o preço e o nome da peça, conforme os parâmetros
     * do construtor
     */
       
    public Produto(String tamanho, String cor, double preco, String nomePeca) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
        this.nomePeca = nomePeca;
    }

    /*
     * A ideia da Programação Orientada a Objetos é modelar algo do mundo real para o virtual.
     * Com isso, ao instanciarmos uma roupa, não faz sentido mudarmos as características como cor, tamanho ou o nome dela,
     * o preço pode, sim, sofre mudanças. 
     */

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomePeca() {
        return nomePeca;
    }
            
}
