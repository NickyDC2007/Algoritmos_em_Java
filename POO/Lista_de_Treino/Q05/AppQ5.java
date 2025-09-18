package Lista_de_Treino.Q05;

import java.util.Scanner;

/*  
 * O programa simula o funcionamento de um elevador.
 *
 * Funcionalidades:
 *  - Inicializa o elevador com informações de:
 *      • andar atual
 *      • total de andares
 *      • quantidade de pessoas presentes
 *      • capacidade máxima de pessoas
 *
 *  - Exibe um menu interativo com opções:
 *      [1] Mudar de andar (subir ou descer)
 *      [2] Alterar quantidade de pessoas (entrar ou sair)
 *      [3] Encerrar o programa
 */

public class AppQ5 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        Elevador Elevador = new Elevador();

        int v = 1;

        System.out.print("Insira o andar atual: ");
        Elevador.andar_atual = input.nextInt();
        System.out.print("Insira o total de andares: ");
        Elevador.total_de_andares = input.nextInt();
        System.out.print("Insira a quantidade de pessoas presentes: ");
        Elevador.quantidade_de_pessoas = input.nextInt();
        System.out.print("Insira a capacidade maxima de pessoas: ");
        Elevador.capacidade_pessoas_max = input.nextInt();

        while (v == 1) {
            System.out.print("\n --- Elevador ---");
            if (Elevador.andar_atual == 0) {
                System.out.printf("\n\nAndar - Térreo");
            } else {
                System.out.printf("\n\nAndar - %d°", Elevador.andar_atual);
            }
            System.out.printf("\nPessoas - %d", Elevador.quantidade_de_pessoas);
            System.out.print("\n\n[1] Mudança de andar");
            System.out.print("\n[2] Alteração de pessoas");
            System.out.print("\n[3] Sair");
            System.out.print("\n\nEscolha uma opção: ");
            Elevador.escolha = input.nextInt();
            
            switch (Elevador.escolha) {
                case 1:
                    Elevador.Subir_Descer();
                    break;
                case 2:
                    Elevador.Entrar_Sair();
                    break;
                case 3:
                    v = 0;
                    break;
                default:
                    System.out.print("Insira uma opção valida. Tente novamente");
                    break;
            }
        }

        input.close();
    }
}
