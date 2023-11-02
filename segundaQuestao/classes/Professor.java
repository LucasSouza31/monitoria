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
    private List<String> disciplinasMinistradas;

    /*
    * O construtor, nessa configuração, quando a classe for instanciada, precisaremos passar o nome e a matrícula do professor.
    * Não será obrigatório passar as disciplinas ministradas por ele. Por que? 
    * Repare os parâmetros que foram passados, nomeProfessor e matriculaProfessor. 
    *  Usamos esse construtor para inicializamos/instaciar o ArrayList
    */

    public Professor(String nomeProfessor, String matriculaProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.matriculaProfessor = matriculaProfessor;
        disciplinasMinistradas = new ArrayList<>();
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
 
    public List<String> getDisciplinasMinistradas() {
        return Collections.unmodifiableList(disciplinasMinistradas);
    }

    /*
    * Métodos sobrecarregados, enquanto o primeiro vai receber uma lista de disciplinas, para isso será necessário criar
    * um array contendo as disciplinas previamente. O segundo método vai receber uma disciplina por vez.
    */
    public void setDisciplinasMinistradas(List<String> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    } 

    /*
    * Para reforçar, este método vai receber uma discplina por vez!
    */
    public void setDisciplinasMinistradas(String disciplinasMinistradas) {
        this.disciplinasMinistradas.add(disciplinasMinistradas);
    } 
    
}
