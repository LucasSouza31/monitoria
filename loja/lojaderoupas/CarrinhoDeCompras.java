

import java.util.ArrayList;

public class CarrinhoDeCompras {

    /*
     * Atributos
     */
    
    private ArrayList<Produto> roupas;
    private ArrayList<Integer> quantidades;
    private double valorTotal;

    /*
     * Construtor
     * Aqui está sendo usado para iniciarlizar as variáveis roupas e quantidades
     */
    public CarrinhoDeCompras() {
        roupas =new ArrayList<>();
        quantidades= new ArrayList<>();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    /*
     * Aqui será adicionado as roupas e quantidades individualmente
     */
    void addRoupa(Produto roupa, int quantidade){
        this.roupas.add(roupa);
        this.quantidades.add(quantidade);
    }

    /*
     * Repare que a variável roupas é um array do tipo Roupa, e quantidades um array do tipo Integer.
     * Deste modo, para manipular os itens de um carrinho, vamos precisar de uma variável
     *  do tipo Roupa e outra do tipo int quantidade  
     */
    public double valorTotalDoCarrinho(){        
        for (int i = 0; i < roupas.size(); i++) {
            Produto roupa = roupas.get(i);
            int quantidade= quantidades.get(i);
            valorTotal = roupa.getPreco()* quantidade;
        }
        return valorTotal;
    }

    void exibirItensDoCarrinho(){        
        for (int i = 0; i < roupas.size(); i++) {
            Produto roupa = roupas.get(i);
            int quantidade= quantidades.get(i);
            System.out.println("Produto: "+ roupa.getNomePeca());
            System.out.println("Quantidade:"+ quantidade );
        }
    }
  
}
