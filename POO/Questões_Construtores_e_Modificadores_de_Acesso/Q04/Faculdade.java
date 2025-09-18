package Questões_Construtores_e_Modificadores_de_Acesso.Q04;

import java.util.ArrayList;

public class Faculdade {
    ArrayList<Aluno> faculdade = new ArrayList<>();

    public void adicionar_aluno(Aluno mano) {
        faculdade.add(mano);
    }

    public int size() {
        return faculdade.size();
    }

    public void ver_alunos() {
        for (Aluno aluno : faculdade) {
            System.out.printf("[%s] %s", aluno.set_alunomatricula(), aluno.set_alunonome());
            System.out.print("\n");
        }
    }

    public void buscar_aluno(String matricula) {
        for (Aluno aluno : faculdade) {
            if (matricula.equals(aluno.set_alunomatricula())) {
                System.out.printf("Nome: %s", aluno.set_alunonome());
                System.out.print("\n");

                System.out.printf("Matrícula: %s", aluno.set_alunomatricula());
                System.out.print("\n");

                System.out.printf("Idade: %d", aluno.set_alunoidade());
                System.out.print("\n");

                System.out.printf("Curso: %s", aluno.set_alunocurso());
                System.out.print("\n");

                return;
            }
        }
        System.out.print("Matrícula não encontrada!");
    }

    public void editar_aluno(String matricula, String nome, int idade, String curso) {
        for (Aluno aluno : faculdade) {
            if(matricula.equals(aluno.set_alunomatricula())) {
                aluno.get_aluno(nome, matricula, idade, curso);
                System.out.print("Atualização efetuada!");
                return;
            }
        }
        System.out.print("\n");
        System.out.print("Matrícula não encontrada!");
    }

    public void remover_aluno(String matricula) {
        faculdade.removeIf(aluno -> matricula.equals(aluno.set_alunomatricula()));
                System.out.print("Aluno removido com sucesso!");
    }
}
