

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Autor> autores;
    private List<Categoria> categorias;

    public Biblioteca() {
        livros = new LinkedList<>();
        autores = new LinkedList<>();
        categorias = new LinkedList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    public List<Autor> getAutores() {
        return autores;
    }
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    public List<Categoria> getCategorias() {
        return Collections.unmodifiableList(categorias);
    }
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void pesquisarLivro(Autor autor) {
        for (Livro livro : livros) {
            for (Autor livroAutor : livro.getAutores()) {
                if (livroAutor.equals(autor)) {
                    System.out.println("Livro: " + livro.getNomeLivro());
                }
             
            }
        }
    }

    public void pesquisarCategoria(Categoria categoriaLivro){
        for (Livro livro : livros) {
            for (Categoria categoria : livro.getCategorias() ) {
                if (categoria.equals(categoriaLivro)) {
                    System.out.println("Livros dessa categoria: "+livro.getNomeLivro());
                }                
            }
        }
    }

  
    
    
    
}
