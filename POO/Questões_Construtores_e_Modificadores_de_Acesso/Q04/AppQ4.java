package Questões_Construtores_e_Modificadores_de_Acesso.Q04;

import java.util.Scanner;

/*
    Sistema de Ensino

    Programa em Java para gerenciar alunos de uma faculdade.
    Permite adicionar, exibir, buscar, editar e remover alunos.

    Estrutura:
    - AppQ4: menu principal e interacao com o usuario.
    - Aluno: classe que armazena dados (nome, matricula, idade, curso).
    - Faculdade: gerencia a lista de alunos e suas operacoes.

    Funcionalidades:
    - Adicionar novo aluno.
    - Listar todos os alunos cadastrados.
    - Buscar aluno pela matricula.
    - Editar informacoes de um aluno.
    - Remover aluno da lista.
*/

public class AppQ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Faculdade facul = new Faculdade();

        boolean saida = false;
        int escolha;

        String nome;
        String matricula;
        int idade;
        String curso;

        while (saida == false) {
            System.out.print("\n\n");
            System.out.print(" ---- HUB ----");
            System.out.print("\n\n");

            System.out.print("[1] Adicionar aluno");
            System.out.print("\n");
            System.out.print("[2] Exibir alunos");
            System.out.print("\n");
            System.out.print("[3] Buscar aluno");
            System.out.print("\n");
            System.out.print("[4] Editar aluno");
            System.out.print("\n");
            System.out.print("[5] Excluir aluno");
            System.out.print("\n\n");
            System.out.print("[0] Sair");
            System.out.print("\n\n");

            System.out.print("Insira sua opção: ");
            escolha = input.nextInt();
            input.nextLine();

            System.out.print("\n");

            switch (escolha) {
                case 0:
                    saida = true;
                    return;
                case 1:
                    System.out.print("Insira o nome do aluno: ");
                    nome = input.nextLine();

                    System.out.print("Insira a matrícula do aluno: ");
                    matricula = input.nextLine();

                    System.out.print("Insira a idade do aluno: ");
                    idade = input.nextInt();
                    input.nextLine();

                    System.out.print("Insira o curso do aluno: ");
                    curso = input.nextLine();

                    Aluno mano = new Aluno();
                    mano.get_aluno(nome, matricula, idade, curso);
                    facul.adicionar_aluno(mano);

                    System.out.print("\n");
                    System.out.print("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    if (facul.size() > 0) {
                        facul.ver_alunos();
                    } else {
                        System.out.print("Nem um aluno encontrado!");
                    }
                    break;
                case 3:
                    System.out.print("Insira a matrícula do aluno a ser procurado: ");
                    matricula = input.nextLine();
                    System.out.print("\n");

                    facul.buscar_aluno(matricula);
                    break;
                case 4:
                    System.out.print("Insira a matrícula do aluno a ser atualizado: ");
                    matricula = input.nextLine();
                    System.out.print("\n");

                    System.out.print("Insira o novo nome do aluno: ");
                    nome = input.nextLine();

                    System.out.print("Insira a nova idade do aluno: ");
                    idade = input.nextInt();
                    input.nextLine();

                    System.out.print("Insira o novo curso do aluno: ");
                    curso = input.nextLine();

                    facul.editar_aluno(matricula, nome, idade, curso);
                    break;
                case 5:
                    if (facul.size() > 0) {
                        System.out.print("Insira a matrícula do aluno a ser retirado: ");
                        matricula = input.nextLine();
                        System.out.print("\n");

                        facul.remover_aluno(matricula);
                    } else {
                        System.out.print("Nem um aluno encontrado!");
                    }
                    break;
                default:
                    System.out.print("Opção inválida. Tente novamente!");
                    break;
            }
        }
        input.close();
    }
}