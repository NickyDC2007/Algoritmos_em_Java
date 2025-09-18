package Lista_de_Treino.Q04;

import java.util.Scanner;

/*  
 * O programa lê um valor em reais e realiza a conversão
 * para dólares utilizando a classe `Conversor_de_moedas`.
 *
 * Funcionalidades:
 *  - O usuário informa um valor em reais.
 *  - O método `Coversao_DR()` faz a conversão do valor.
 *  - Ao final, o programa exibe o resultado em dólares.
 */

public class AppQ4 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        Conversor_de_moedas CM = new Conversor_de_moedas();

        System.out.print("Insira o valor a ser convertido em reais: ");
        CM.Real = input.nextDouble();

        CM.Coversao_DR();

        System.out.printf("O valor convertido em dolar é %.2f", CM.Real);

        input.close();
    }
}
