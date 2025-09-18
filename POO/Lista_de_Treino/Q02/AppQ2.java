package Lista_de_Treino.Q02;

import java.util.Scanner;

/*  
 * O programa lê o nome e o ano de nascimento de uma pessoa,
 * além do ano atual informado pelo usuário.
 *
 * A partir desses dados, ele calcula a idade da pessoa
 * utilizando o método `Idade()` da classe Pessoa.
 */

public class AppQ2 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        Pessoa pessoas = new Pessoa();

        System.out.print("Insira o nome de usuário: ");
        pessoas.nome = input.nextLine();

        System.out.print("\nInsira seu ano de nascimento: ");
        pessoas.ano_de_nas = input.nextInt();
        System.out.print("Insira o ano atual: ");
        pessoas.ano_atual = input.nextInt();

        pessoas.Idade();

        input.close();
    }
}
