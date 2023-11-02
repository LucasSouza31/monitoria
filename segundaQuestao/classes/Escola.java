package Monitoria.escola.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Escola {
    /*
     * Atribulos da classe
     */
    private String nome;
    private List<Turma> turmas;

    /*
     * Construtor da classe, aqui será obrigado, a cada vez que for instanciado,
     * passar o "nome", nesse caso o nome da escola.
     * Dentro dele está sendo iniciado/instanciado o array de turmas.
     */
    public Escola(String nome) {
        this.nome = nome;
        turmas = new ArrayList<>();
    }

    /*
     * Métodos para manipular os atributos da classe, Getters e Setters
     */
    public String getNome() {
        return nome;
    }

    public List<Turma> getTurmas() {
        return Collections.unmodifiableList(turmas);
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public void setTurma(Turma turma) {
        this.turmas.add(turma);
    }


 


}
