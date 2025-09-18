package Questões_Modificadores_de_Acesso.Q01;

import java.util.ArrayList;

public class Turma {
    ArrayList<Aluno> Turma = new ArrayList<>();

    public void adicionar_aluno(Aluno a) {
        Turma.add(a);
    }

    public void mostrar_alunos() {
        for (Aluno aluno : Turma) {
            System.out.printf("[%s] %s", aluno.get_matricula(), aluno.nome);
            System.out.print("\n");
        }
    }
}
