package Monitoria.biblioteca;

import java.util.LinkedList;
import java.util.List;

public class Livro {
    private List<Autor> autor;
    private String nomeLivro;
    private List<Categoria> categoria;

    public Livro(String nomeLivro) {
        autor = new LinkedList<>();
        this.nomeLivro = nomeLivro;
        categoria = new LinkedList<>();
    }

    public List<Autor> getAutor() {
        return autor;
    }
    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }
  
    
    public List<Categoria> getCategoria() {
        return categoria;
    }
    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }


    public String getNomeLivro() {
        return nomeLivro;
    }


    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

      
}
