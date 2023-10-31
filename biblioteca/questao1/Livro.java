

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private List<Autor> autores;
    private String nomeLivro;
    private List<Categoria> categoria;

    public Livro(String nomeLivro) {
        autores = new ArrayList<>();
        categoria = new ArrayList<>();
        this.nomeLivro = nomeLivro;        
    }

    public Livro(List<Autor> autores, String nomeLivro, List<Categoria> categoria) {
        this.autores = autores;
        this.nomeLivro = nomeLivro;
        this.categoria = categoria;
    }
    
    public List<Categoria> getCategoria() {
        return categoria;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public List<Autor> getAutores() {
        return autores;
    }
      

    
}
