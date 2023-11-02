package Monitoria.escola.classes;

public class Aluno {

    // Atribulos do aluno
    private String nomeDoAluno;
    private String numeroDeMatricula;

    /*
     * Construtor é um método com o mesmo nome da classe, do jeito que ele está
     * sempre que um aluno for instanciado, será necessário passar o nome e a matrícula do aluno.
     */
    public Aluno(String nomeDoAluno, String numeroDeMatricula) {
        this.nomeDoAluno = nomeDoAluno;
        this.numeroDeMatricula = numeroDeMatricula;
    }

    /*
     * Como os atributos estão privados, os métodos Getters e Setters foram criado para manipulá-los
     */

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }
 
    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }
      
}
