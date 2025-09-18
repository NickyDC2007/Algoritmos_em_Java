package Questões_Construtores_e_Modificadores_de_Acesso.Q05;

import java.util.Scanner;

/*
    Sistema de Cadastro de Usuários

    Programa em Java para realizar o cadastro de um usuário,
    validando email e idade antes de concluir o processo.

    Estrutura:
    - App05: controla a interação com o usuário e o fluxo principal.
    - Usuario: classe responsável por armazenar os dados
    e validar informações fornecidas.

    Funcionalidades:
    - Solicitar nome, email e idade do usuário.
    - Validar email (deve conter '@' e '.').
    - Validar idade (deve ser um número positivo).
    - Confirmar cadastro somente se todas as validações forem atendidas.
*/

public class App05 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        Usuario u = new Usuario();

        boolean cadastro = false;

        boolean v_email;
        boolean v_idade;

        String nome;
        String email;
        int idade;

        while (cadastro == false) {
            System.out.print("\n\n");
            System.out.print(" --- Cadastro --- ");
            System.out.print("\n\n");

            System.out.print("Insira seu nome de usuário: ");
            nome = input.nextLine();

            System.out.print("Insira seu email: ");
            email = input.nextLine();
            v_email = u.email_valido(email);

            System.out.print("Insira sua idade: ");
            idade = input.nextInt();
            input.nextLine();
            v_idade = u.idade_valida(idade);

            System.out.print("\n");

            if (v_email == true && v_idade == true) {
                System.out.print("Cadastro realziado com sucesso!");
                u.set_usuario(nome, email, idade);
                cadastro = true;
                break;
            }

            if (v_email == false) {
                System.out.print("Insira um email válido usando @ e .");
                System.out.print("\n");
            }

            if (v_idade == false) {
                System.out.print("Insira uma idade válida");
            }
        }

        System.out.print("\n\n");
        System.out.print(" --- Logado ---");
        System.out.print("\n\n");

        System.out.printf("Usuário: %s", u.set_nome());
        System.out.print("\n");
        System.out.printf("Email: %s", u.set_email());
        System.out.print("\n");
        System.out.printf("Idade: %d", u.set_idade());
        System.out.print("\n");

        input.close();
    }
}
