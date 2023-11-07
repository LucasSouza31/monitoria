

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Departamento {

    /*
     * Atributos da classe
     */
    private String genero;
    private List<Produto> roupas;
    private CarrinhoDeCompras carrinho;
    
    /*
     * Construtor
     * Quando esta classe for instanciada, será necessário informar o gênero desse departamento
     */
    public Departamento(String genero) {
        this.genero = genero;
        roupas = new ArrayList<>();
    }

    /*
     * Métodos para definir e obter um departamento
     */
    public String getgenero() {
        return genero;
    }
    public void setgenero(String genero) {
        this.genero = genero;
    }

    /*
     * Método para obter as roupas do departamento
     */
    public List<Produto> getRoupas() {
        return Collections.unmodifiableList(roupas);
    }
    
    /*
     * Método para adicionar roupas individualmente ao departamento
     */
    void addRoupas(Produto roupa){

        if (this.roupas.contains(roupa)) {
            if (Objects.equals(roupa, this.genero)) {
                System.out.println("ok");
            }
        }

    }
    
    /*
     * Quando chamado, este método exibirá os detalhes dos itens do departamento
     */
    void exibirPreco(){
        for (Produto roupa : roupas) {
            System.out.println();
            System.out.println("Produto: "+ roupa.getNomePeca());
            System.out.println("Cor: "+ roupa.getCor());
            System.out.println("Tamanho: "+ roupa.getTamanho());
            System.out.println("Valor: "+ roupa.getPreco());
            System.out.println("-------------");
        }
    }

}
