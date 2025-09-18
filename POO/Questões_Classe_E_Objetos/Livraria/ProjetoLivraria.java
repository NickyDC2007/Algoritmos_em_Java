package Questões_Classe_E_Objetos.Livraria;

import java.util.Scanner;

/*
 * O programa cadastra e consulta livros (classe Livros).
 *
 * Funcionalidades:
 *  - Adicionar até n livros informando título, autor, quantidade em estoque e preço;
 *  - Armazenar os em um array de objetos Livros;
 *  - Exibir um menu interativo:
 *      [1] Adicionar Livros (cadastra um novo livro);
 *      [2] Lista de Livros (mostra todos os livros cadastrados);
 *      [0] Sair (encerra o programa);
 */

public class ProjetoLivraria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estante estantes = new Estante();

        int escolha;
        int q_livros = 0;

        while(true) {
            System.out.print("\n\n ---- Livraria ----");
            System.out.print("\n\n[1] Adicionar Livros");
            System.out.print("\n[2] Lista de Livros");
            System.out.print("\n[3] Remover Livros");
            System.out.print("\n[0] Sair");
            System.out.print("\n\nEscolha uma opção: ");
            escolha = input.nextInt();
            
            input.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("\nInsira o titulo do livro: ");
                    String t = input.nextLine();

                    System.out.print("Insira o autor do livro: ");
                    String a = input.nextLine();

                    System.out.print("Insira a quantidade de estoque do livro: ");
                    int e = input.nextInt();

                    System.out.print("Insira o preço do livro: ");
                    double p = input.nextDouble();

                    q_livros++;
                    
                    Livros livros = new Livros();
                    livros.adicionar_livro(t, a, e, p, estantes.verificar_id());
                    estantes.adicionar_livros(livros);
                    System.out.print("\nO livro foi adicionado com sucesso");
                    break;
                case 2:
                    if (q_livros >= 1) {
                        estantes.printar_livros();
                    }
                    else {
                        System.out.print("Quantidade inexistade à ser verificada");
                    }
                    break;
                case 3:
                    System.out.print("Insira o id do livro a ser excluido: ");
                    int id = input.nextInt();

                    estantes.remover_livros(id);

                    break;
                case 0:
                    System.out.print("\nPrograma Encerrado!");
                    input.close();
                    return;
                default:
                    System.out.print("Comando desconhecido. Tente novamente.");
                    break;
            }
        }
    }
}
