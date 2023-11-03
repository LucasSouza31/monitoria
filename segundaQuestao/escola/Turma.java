



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {

    /*
     * Atributos para turma
     */
    protected String nomeTurma;
    protected List<Aluno> alunos;
    protected List<Professor> professores;

    /*
     * Construtor da classe, aqui será obrigado a fornecer o nome da turma.
     * Nele está sendo iniciado/instanciado os arrays para alunos e professores.
     */
    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
    }

    /*
     * Métodos para manipular os atributos da classe, Getters e Setters
     */
    
    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public List<Aluno> getAlunos() {
        return Collections.unmodifiableList(alunos);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void setAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }


    public List<Professor> getProfessores() {
        return Collections.unmodifiableList(professores);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }
  
}
