package Questões_Classe_E_Objetos.Q01;

import java.util.Scanner;

/*
 * O programa coleta nome e idade de um usuario (classe Pessoa)
 *
 * Funcionalidades:
 *  - Ler dados via Scanner (nome e idade)
 *  - Enviar os dados para Pessoa.inserir_dados(n, i)
 *  - Exibir os dados com Pessoa.exibir_dados()
 */

public class AppQ01 {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        System.out.print("Insira o nome do usuário: ");
        String n = input.nextLine();

        System.out.print("Insira a idade do usuário: ");
        int i = input.nextInt();

        usuario.inserir_dados(n, i);

        usuario.exibir_dados();

        input.close();
    }
}
