package Lista_Tratamento_de_Excessao_e_Heranca.Q01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Programa para operações com matrizes 4x4.

    Estrutura:
    - Classe Matrizes: gerencia as matrizes e operações.
    - Classe Matriz: representa cada matriz.

    Funcionalidades:
    - Adicionar duas matrizes.
    - Somar, subtrair e multiplicar matrizes.
    - Mostrar matrizes transpostas.
    - Visualizar matrizes cadastradas.
    - Encerrar o programa pelo menu.
*/

public class AppQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrizes matrizes = new Matrizes();

        boolean saida = false;
        int escolha;

        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];

        do {
            System.out.print("\n\n");
            System.out.print(" --- Matrizes ---");
            System.out.print("\n\n");

            System.out.print("[1] Adicionar Matrizes");
            System.out.print("\n");
            System.out.print("[2] Somar Matrizes");
            System.out.print("\n");
            System.out.print("[3] Subtrair Matrizes");
            System.out.print("\n");
            System.out.print("[4] Multiplicar Matrizes");
            System.out.print("\n");
            System.out.print("[5] Matrizes Transpostas");
            System.out.print("\n");
            System.out.print("[6] Visualizar Matrizes");
            System.out.print("\n\n");
            System.out.print("[0] Sair");
            System.out.print("\n\n");

            System.out.print("Insira uma opção: ");
            
            try {
                escolha = input.nextInt();
            } catch (InputMismatchException e){
                escolha = 7;
                input.nextLine();
            }

            System.out.print("\n");

            switch (escolha) {
                case 0:
                    input.close();
                    saida = true;
                    break;
                case 1:
                    matrizes.limpar_matrizes();

                    System.out.print("1° Matriz: ");
                    System.out.print("\n\n");

                    for(int x = 0; x < 4; x++) {  
                        for(int y = 0; y < 4; y++) {
                            System.out.printf("Insira o valor da %d° linha, %d° coluna: ", x + 1, y + 1);
                            matriz1[y][x] = input.nextInt();
                        }
                    }

                    System.out.print("\n");
                    matrizes.adicionar_matriz(new Matriz(matriz1));

                    System.out.print("2° Matriz: ");
                    System.out.print("\n\n");

                    for(int x = 0; x < 4; x++) {  
                        for(int y = 0; y < 4; y++) {
                            System.out.printf("Insira o valor da %d° linha, %d° coluna: ", x + 1, y + 1);
                            matriz2[y][x] = input.nextInt();
                        }
                    }
                    
                    System.out.print("\n");
                    matrizes.adicionar_matriz(new Matriz(matriz2));

                    System.out.print("Matrizes adicionadas com sucesso!");
                    break;
                case 2:
                    matrizes.somar_matrizes();
                    System.out.print("Matrizes somadas com sucesso!");
                    break;
                case 3:
                    matrizes.subtrair_matrizes();
                    System.out.print("Matrizes subtraidas com sucesso!");
                    break;
                case 4:
                    matrizes.multiplicar_matrizes();
                    System.out.print("Matrizes multiplicadas com sucesso!");
                    break;
                case 5:
                    matrizes.matrizes_transpostas();
                    System.out.print("Matrizes transpostas mostradas com sucesso!");
                    break;
                case 6:
                    matrizes.mostrar_matrizes();
                    System.out.print("Matrizes visualizadas com sucesso!");
                    break;
                default:
                    System.out.print("Opção Inválida!");
                    break;
            }
            
        } while (saida == false);
    }
}