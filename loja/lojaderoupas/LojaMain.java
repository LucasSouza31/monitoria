package questao3.lojaderoupas;

public class LojaMain {
    public static void main(String[] args) {

        // instanciando um departamento para guardar as roupas
        Departamento roupasMasculinas = new Departamento("Masculino");

        // Instanciando um carrinho de compras para pôr os itens
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Instanciando roupas que ficarão no departamento
        Produto camisa = new Produto("M", "Amarelo", 50.9, "camisa");
        Produto camisaRegata = new Produto("M", "Azul", 60.9, "camisa regata");
        Produto calca = new Produto("44", "Azul", 123.9, "calça");

        // adicionando roupas ao departamento
        roupasMasculinas.addRopas(calca);
        roupasMasculinas.addRopas(camisa);
        roupasMasculinas.addRopas(camisaRegata);

        // Exibindo os preços de todas as roupas
        roupasMasculinas.exibirPreco();

        // Adicionando um item ao carrinho, juntamente com a quantidade
        carrinhoDeCompras.addRoupa(calca, 2);
        
        // Exibindo os itens que estão no carrinho
        carrinhoDeCompras.exibirItensDoCarrinho();


        System.out.println(carrinhoDeCompras.valorTotalDoCarrinho());


    }
}
