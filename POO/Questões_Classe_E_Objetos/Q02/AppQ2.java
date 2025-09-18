package Questões_Classe_E_Objetos.Q02;

import java.util.Scanner;

/*
 * O Programa cadastra e consulta produtos (classe Produto)
 *
 * Funcionalidades:
 *  - Ler 5 produtos via Scanner (nome, quantidade, preco)
 *  - Preencher o array de objetos Produto com inserir_dados(n, q, p)
 *  - Exibir um menu com a lista de produtos
 *  - Ao escolher um indice [1..5], mostrar os dados do produto selecionado
 *  - Opcao [6] encerra o programa
 */

public class AppQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto[] produtos = new Produto[5];

        String[]n = new String[5];
        int[]q = new int[5];
        double[]p = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("\nInsira o nome do produto: ");
            n[i] = input.nextLine();

            System.out.print("Insira a quantidade do produto: ");
            q[i] = input.nextInt();
            input.nextLine();

            System.out.print("Insira o preço do produto: ");
            p[i] = input.nextDouble();
            input.nextLine();

            produtos[i] = new Produto();
            produtos[i].inserir_dados(n[i], q[i], p[i]);
        }

        while (true) {
            System.out.print(" ---- Produtos ----");
            
            System.out.print("\n");

            for(int i = 0; i < 5; i++) {
                System.out.printf("\n[%d] %s", i + 1, produtos[i].nome);
            }
            System.out.print("\n[6] Sair");

            System.out.print("\n\nEscolha uma opção: ");
            int o = input.nextInt();

            if(o >= 1 && o <= 5) {
                produtos[o - 1].mostrar_dados(o - 1);
            }
            else {
                switch (o) {
                case 6:
                    input.close();
                    return;
                default:
                    System.out.print("Opção não existente. Tente novamente.\n\n");
                    break;
                }
            }
        }
    }
}
