# Gerenciamento de Escola

Desenvolva um programa para gerenciar informações de uma **escola**. Cada escola **contém várias turmas**, cada **turma tem vários alunos e professores**. Os **alunos podem pertencer a mais de uma turma**. Os **professores ministram aulas em uma ou mais turmas**. Os dados devem ser organizados para permitir consultas sobre quais turmas um professor leciona e quais alunos estão matriculados em uma turma específica.

## Interpretação

1. Vamos desenvolver uma solução para gerenciar informações de uma **escola**;
2. Repare que cada **escola tem várias turmas**, ficando subentendido que vamos utilizar um **Array de Turmas**;
3. Como **turma tem vários alunos e professores**, vamos precisar de uma classe turma, nela vai precisar conter **Array** para alunos e professores;
4. Outra observação é **"alunos podem pertencer a mais de uma turma"**, assim a classe **Turma** vai precisar ter um **Array** de alunos;
5. Os **"professores ministram aulas em uma ou mais turmas"**, na classe turma vamos precisar ter um **Array** de professores;
6. Implementar uma funcionalidade para buscar em **quais turmas o professor leciona**;
7. Implementar uma funcionalidade para **saber quais alunos estão matriculados nas turmas**;
8. A questão não pede para **identificar quais disciplinas foram lecionadas em cada turma**;
