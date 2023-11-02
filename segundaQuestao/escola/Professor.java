package Monitoria.escola.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Professor {
    /*
    * Atributos da classe, você pode escolher o que fazer mais sentido para você!
    */
    private String nomeProfessor;
    private String matriculaProfessor;
    private String disciplina;

    /*
    * O construtor, nessa configuração, quando a classe for instanciada, precisaremos passar o nome e a matrícula do professor.
    * Repare os parâmetros que foram passados, nomeProfessor e matriculaProfessor. 
    *  
    */

    public Professor(String nomeProfessor, String matriculaProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.matriculaProfessor = matriculaProfessor;       
    }

    /*
    * Métodos para manipular os atributos da classe, Getters e Setters.
    */
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getMatriculaProfessor() {
        return matriculaProfessor;
    }
 
    public String getDisciplina() {
        return disciplina;
    } 

    
}
