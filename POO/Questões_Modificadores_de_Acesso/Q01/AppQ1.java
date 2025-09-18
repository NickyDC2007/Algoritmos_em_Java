package Questões_Modificadores_de_Acesso.Q01;

/*
    Programa que gerencia uma turma de alunos.
    O nome é público (acesso direto) e a matrícula é privada (usa get/set).
    A turma permite adicionar alunos e exibir nomes e matrículas.
*/

public class AppQ1 {
    public static void main() {
        Turma turma = new Turma();

        turma.adicionar_aluno(new Aluno("Jose", "0001"));
        turma.adicionar_aluno(new Aluno("Luca", "0002"));
        turma.adicionar_aluno(new Aluno("Ronald", "0003"));
        turma.adicionar_aluno(new Aluno("Carlos", "0004"));
        turma.adicionar_aluno(new Aluno("Maria", "0005"));

        turma.mostrar_alunos();
    }
}
