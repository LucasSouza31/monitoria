
import java.util.ArrayList;
import java.util.List;



public class EscolaMain {
    public static void main(String[] args) {

        /*
         * Vamos começar construindo uma escola.
         * Aqui foi declarado uma variável do tipo Escola com o nome ifba. Como consta na classe Escola, quando esta for instanciada,
         * deverá ser passado um nome, nesse caso "IFBA".
         */

        Escola ifba = new Escola("IFBA");

        /*
         * Agora que temos a escola, vamos construir as turmas
         */
        Turma ads = new Turma("ADS01");
        Turma rdc = new Turma("RDC01");

        /*
         * Com as turmas, vamos criar os alunos
         */

        Aluno a1 = new Aluno("Aluno1", "01");
        Aluno a2 = new Aluno("Aluno2", "02");
        Aluno a3 = new Aluno("Aluno3", "03");
        Aluno a4 = new Aluno("Aluno4", "04");

        /*
         * Instanciando professores
         */

        Professor ronaldo = new Professor("Ronaldo", "000001");
        Professor alice = new Professor("Alice", "000003");

        /*
         * Adicionando alunos e professores nas turmas
         */

         ads.adicionarAluno(a4);
         ads.adicionarAluno(a3);
         ads.adicionarAluno(a2);
         ads.adicionarProfessor(alice);

        rdc.alunos.add(a1);
        rdc.alunos.add(a2);
        rdc.adicionarAluno(a4);
        rdc.adicionarProfessor(ronaldo);

        /*
         * Adicionando as turmas à escola
         */

         ifba.adicionarTurma(rdc);
         ifba.adicionarTurma(ads);

        // Alunos que estão na turma ads
        for (Aluno aluno : ads.getAlunos()) {
            System.out.println(aluno.getNomeDoAluno());
        }

        // Professores da turma ads
        for (Professor professor : ads.getProfessores()) {
            System.out.println(professor.getNomeProfessor());
        }

        //turmas em que um professor específico leciona
        for (Turma turma : ifba.getTurmas()) {
            if (turma.getProfessores().contains(ronaldo)) {
                System.out.println(turma.getNomeTurma());
            }
        }


    }
}
