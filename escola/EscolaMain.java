package Monitoria.escola;

import java.util.ArrayList;
import java.util.List;

import Monitoria.escola.classes.Aluno;
import Monitoria.escola.classes.Escola;
import Monitoria.escola.classes.Professor;
import Monitoria.escola.classes.Turma;

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
        Turma pm = new Turma("PM01");

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
        Professor silvio = new Professor("Silvio", "000002");
        Professor alice = new Professor("Alice", "000003");

        /*
         * Definindo as disciplinas ministradas pelos professores
         */

        ronaldo.setDisciplinasMinistradas("Matemática");
        ronaldo.setDisciplinasMinistradas("Física");

        silvio.setDisciplinasMinistradas("Português");
        silvio.setDisciplinasMinistradas("Redação");

        /*
         * Aqui será passado uma lista de disciplinas para demonstrar o uso do método
         * sobrecarregado
         */

        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("Inglês");
        disciplinas.add("Espanhol");
        disciplinas.add("Francês");

        /*
         * Aqui está sendo passado uma lista de disciplinas
         */
        alice.setDisciplinasMinistradas(disciplinas);

        /*
         * inserindo alunos na turma de ads
         */
        ads.setAluno(a1);
        ads.setAluno(a2);
        ads.setAluno(a3);
        ads.setAluno(a4);

        /*
         * inserindo alunos na turma de rdc
         */
        rdc.setAluno(a1);
        rdc.setAluno(a2);
        rdc.setAluno(a3);
        rdc.setAluno(a4);

        /*
         * Criando lista de professor para adicionar nas turmas
         */

        List<Professor> professores = new ArrayList<>();
        professores.add(alice);
        professores.add(ronaldo);

        /*
         * inserindo professores na turma de ads
         */
        ads.setProfessores(professores);

        /*
         * inserindo turma na escola
         */

        ifba.setTurma(ads);
        

    }
}
