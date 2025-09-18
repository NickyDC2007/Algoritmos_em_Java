package Lista_de_Treino.Q03;

import java.util.Scanner;

/*  
 * O programa lê os dados de um funcionário:
 *  - nome
 *  - salário bruto
 *  - valor dos descontos
 *
 * A partir dessas informações, calcula o salário líquido
 * por meio do método `Calcular()` da classe Funcionario.
 *
 * Ao final, exibe o valor do salário líquido do funcionário.
 */

public class AppQ3 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        Funcionario funcionarios = new Funcionario();

        System.out.print("Insira o nome do funcionario: ");
        funcionarios.nome = input.nextLine();

        System.out.print("\nInsira o salário bruto do funcionario: ");
        funcionarios.sal_bruto = input.nextDouble();
        System.out.print("Insira o valor descontado: ");
        funcionarios.desconto = input.nextDouble();

        funcionarios.Calcular();

        System.out.printf("\nO salário liquido do funcionario é de %.2f", funcionarios.sal_liquido);

        input.close();
    }
}
