

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Livro {
    private List<Autor> autores;
    private String nomeLivro;
    private List<Categoria> categorias;


    public Livro(String nomeLivro, List<Autor> autores, List<Categoria> categorias) {
        this.nomeLivro = nomeLivro;
        this.autores = new ArrayList<>(autores);
        this.categorias = new ArrayList<>(categorias);
    }
       

    public List<Categoria> getCategorias() {
        return Collections.unmodifiableList(categorias);
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public List<Autor> getAutores() {
        return Collections.unmodifiableList(autores);
    }
      

    
}
