package Monitoria.biblioteca;

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


        Biblioteca biblioteca= new Biblioteca();

        Autor autor1= new Autor("Augusto", "augusto@gmail.com");
        Autor autor2= new Autor("Silvio", "silvio@gmail.com");
        Autor autor3= new Autor("Joana", "joana@gmail.com");
        Autor autor4= new Autor("Silvia", "silvia@gmail.com");

        Categoria categoria= new Categoria("Acadêmico", "livros de programação");
        Categoria categoria2= new Categoria("Biografia", "livros sobre empreendedorismo");
        Categoria categoria3= new Categoria("Autoajuda", "livros sobre carreira");
        
        
        List<Categoria> categorias1= new ArrayList<>();
        List<Categoria> todasAsCategorias= new ArrayList<>();
        
        categorias1.add(categoria);
        categorias1.add(categoria3);

        todasAsCategorias.add(categoria);
        todasAsCategorias.add(categoria2);
        todasAsCategorias.add(categoria3);


        List<Autor> autoresLogicaProgramacao = new ArrayList<>();
        List<Autor> autoresLogicaProgramacao2= new ArrayList<>();
        List<Autor> autoresLogicaProgramacao3= new ArrayList<>();
        List<Autor>todosOsAutores= new ArrayList<>();
        
        autoresLogicaProgramacao.add(autor1);
        autoresLogicaProgramacao.add(autor2);

        autoresLogicaProgramacao2.add(autor4);
        autoresLogicaProgramacao2.add(autor3);

        autoresLogicaProgramacao3.add(autor2);

        todosOsAutores.add(autor1);
        todosOsAutores.add(autor2);
        todosOsAutores.add(autor3);
        todosOsAutores.add(autor4);

        Livro logica= new Livro("Lógica de programação I");
        logica.setAutor(autoresLogicaProgramacao);
        logica.setCategoria(categorias1);

        Livro logica2= new Livro("Lógica de programação II");
        logica2.setAutor(autoresLogicaProgramacao2);
        logica2.setCategoria(categorias1);

        Livro logica3= new Livro("Lógica de Programação III");
        logica3.setAutor(autoresLogicaProgramacao3);
        logica3.setCategoria(categorias1);

        List<Livro>livros= new ArrayList<>();

        livros.add(logica3);
        livros.add(logica2);
        livros.add(logica);
        
        biblioteca.setLivros(livros);
        biblioteca.setAutores(todosOsAutores);
        biblioteca.setCategorias(todasAsCategorias);

        //biblioteca.pesquisarLivro(autor2);

        biblioteca.pesquisarCategoria(categoria2);


    }
}
