package questao3.lojaderoupas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departamento {

    /*
     * Atributos da classe
     */
    private String genero;
    private List<Produto> roupas;
    
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
    void addRopas(Produto roupa){
        this.roupas.add(roupa);
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
