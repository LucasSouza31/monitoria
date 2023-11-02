

import java.util.ArrayList;
import java.util.List;

public class ExemploBiblioteca {
    public static void main(String[] args) {
        /*
         * Biblioteca Digital:
            Crie um sistema de biblioteca digital com livros, autores e categorias.
             Os livros pertencem a autores, e cada livro pode ser classificado em uma ou mais categorias. 
            Os usuários podem fazer pesquisas por autor ou categoria e visualizar os livros disponíveis.
         */


         /*
          * Instanciando biblioteca
          */
        Biblioteca biblioteca= new Biblioteca();

        /*
         * Instaciando os autores
         */
        Autor autor1= new Autor("Augusto", "augusto@gmail.com");
        Autor autor2= new Autor("Silvio", "silvio@gmail.com");
        Autor autor3= new Autor("Joana", "joana@gmail.com");
        Autor autor4= new Autor("Silvia", "silvia@gmail.com");

        /*
         * Instanciando as categorias
         */
        Categoria informatica= new Categoria("Informática", "livros de programação");
        Categoria biografia= new Categoria("Biografia", "livros sobre biografia e empreendedorismo");
        Categoria autoajuda= new Categoria("Autoajuda", "livros sobre carreira");
        
        
        /*
         * Criando um array, já que um livro pode ter mais de uma categoria
         */
        List<Categoria> categoriaMista= new ArrayList<>();

        /*
         * Instanciando outro array para armazenar todos os categorias
         */
        List<Categoria> todasAsCategorias= new ArrayList<>();
        
        /*
         * Aqui estamos armazenando quantas categorias um livro vai fazer parte
         */
        categoriaMista.add(informatica);
        categoriaMista.add(autoajuda);

        /*
         * Guardando todas as categorias
         */
        todasAsCategorias.add(informatica);
        todasAsCategorias.add(biografia);
        todasAsCategorias.add(autoajuda);


        /*
         * Como um livro pode ter mais de um autor, aqui será instanciando um array para guardar autores
         */
        List<Autor> autoresLogicaProgramacao = new ArrayList<>();
        List<Autor> autoresLogicaProgramacao2= new ArrayList<>();
        List<Autor> autoresLogicaProgramacao3= new ArrayList<>();
        List<Autor>todosOsAutores= new ArrayList<>();
        
        /*
         * Armazenando autores 
         */
        autoresLogicaProgramacao.add(autor1);
        autoresLogicaProgramacao.add(autor2);

        /*
         * Armazenando autores 
         */

        autoresLogicaProgramacao2.add(autor4);
        autoresLogicaProgramacao2.add(autor3);

         /*
         * Armazenando autores 
         */
        autoresLogicaProgramacao3.add(autor2);

        /*
         * Guardando todos os autores
         */
        todosOsAutores.add(autor1);
        todosOsAutores.add(autor2);
        todosOsAutores.add(autor3);
        todosOsAutores.add(autor4);

        /*
         * Instanciando livro e definindo autores
         */

        Livro logica= new Livro("Lógica de programação I",autoresLogicaProgramacao, categoriaMista);  

        Livro logica2= new Livro("Lógica de programação II",autoresLogicaProgramacao2,categoriaMista);

        Livro logica3= new Livro("Lógica de Programação III",autoresLogicaProgramacao3,categoriaMista);


        /*
         * Como biblioteca recebe vários livros, este array vai guardar todos os livros
         */
        List<Livro>livros= new ArrayList<>();

        livros.add(logica3);
        livros.add(logica2);
        livros.add(logica);
        
        biblioteca.setLivros(livros);
        biblioteca.setAutores(todosOsAutores);
        biblioteca.setCategorias(todasAsCategorias);

        /*
         * Pesquisar autor
         */
        biblioteca.pesquisarLivro(autor2);

        /*
         * Pesquisar livro
         */
        //biblioteca.pesquisarCategoria(informatica);


    }
}
