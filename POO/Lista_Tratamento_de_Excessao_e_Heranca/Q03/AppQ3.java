package Lista_Tratamento_de_Excessao_e_Heranca.Q03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Programa para gerenciamento de uma loja com menu interativo no console.

    Estrutura:
    - Classe Produto: representa um item com nome, código, quantidade e preço.
    - Classe Estoque: gerencia a lista de produtos (adicionar, remover, alterar, listar).

    Funcionalidades:
    - Adicionar um novo produto com código gerado automaticamente.
    - Remover produto existente pelo código.
    - Alterar a quantidade de um produto já cadastrado.
    - Listar todos os produtos disponíveis no estoque.
    - Encerrar o programa através da opção do menu.

    Tratamento de exceções:
    - Uso de InputMismatchException para capturar entradas inválidas.
    - Garantia de que quantidade e preço sejam valores positivos.
    - Limpeza do buffer do Scanner após cada entrada para evitar erros de leitura.
*/

public class AppQ3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estoque estoque = new Estoque();

        boolean tentativa = false;
        boolean saida = false;
        int escolha;

        String nome = "";
        int codigo = 0;
        int quantidade = 0;
        double preco = 0;

        do {

            System.out.print("\n\n");
            System.out.print(" --- Loja ---");
            System.out.print("\n\n");

            System.out.print("[1] Adicionar Produto");
            System.out.print("\n");
            System.out.print("[2] Remover Produto");
            System.out.print("\n");
            System.out.print("[3] Alterar quantidade do Produto");
            System.out.print("\n");
            System.out.print("[4] Visualizar Produtos");
            System.out.print("\n\n");
            System.out.print("[0] Sair");
            System.out.print("\n\n");

            System.out.print("Insira uma opção válida: ");

            try {
                escolha = input.nextInt();
            } catch (InputMismatchException e) {
                escolha = 5;
            }

            input.nextLine();
            System.out.print("\n");

            switch (escolha) {
                case 0:
                    input.close();
                    saida = true;
                    break;
                case 1:
                    System.out.print("-- Adicionar Produto --");
                    System.out.print("\n\n");
                    
                    System.out.print("Insira o nome do produto a ser adicionado: ");
                    nome = input.nextLine();
                    System.out.print("\n");
            
                    do {
                        try {
                            System.out.print("Insira a quantidade do produto a ser adicionado: ");
                            quantidade = input.nextInt();
                            
                            if (quantidade >= 0) {
                                tentativa = true;  
                            } else {
                                System.out.print("Insira um número natural. Tente novamente!");
                                System.out.print("\n");
                                tentativa = false;
                            }

                        } catch (InputMismatchException e) {
                            System.out.print("Insira um número natural. Tente novamente!");
                            System.out.print("\n");
                            tentativa = false;
                        }
                        input.nextLine();
                    } while (!tentativa);
                    System.out.print("\n");

                    do {
                        try {
                            System.out.print("Insira o preço do produto a ser adicionado: ");
                            preco = input.nextDouble();

                            if (preco >= 0) {
                                tentativa = true;
                            } else {
                                System.out.print("Insira um número racional positivo. Tente novamente!");
                                System.out.print("\n");
                                tentativa = false;
                            }

                        } catch(InputMismatchException e) {
                            System.out.print("Insira um número racional. Tente novamente!");
                            System.out.print("\n");
                            tentativa = false;
                        }
                        input.nextLine();
                    } while (!tentativa);
                    System.out.print("\n");

                    estoque.adicionar_produto(new Produto(nome, estoque.gerar_codigo(), quantidade, preco));

                    System.out.print("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("-- Remover Produto --");
                    System.out.print("\n\n");

                    System.out.print("Insira o código do produto a ser removido: ");
                    codigo = input.nextInt();
                    System.out.print("\n");

                    estoque.remover_produto(codigo);
                    break;
                case 3:
                    System.out.print("-- Alterar Produto --");
                    System.out.print("\n\n");

                    System.out.print("Insira o código do produto a ser alterado: ");
                    codigo = input.nextInt();
                    System.out.print("\n");

                    do {
                        try {
                            System.out.print("Insira a nova quantidade do produto: ");
                            quantidade = input.nextInt();

                            if (quantidade >= 0) {
                                tentativa = true;
                            } else {
                                System.out.print("Insira um número natural. Tente novamente!");
                                System.out.print("\n");
                                tentativa = false;
                            }
                        } catch (InputMismatchException e) {
                            System.out.print("Insira um número natural. Tente novamente!");
                            System.out.print("\n");
                            tentativa = false;
                        }
                        input.nextLine();
                    } while (!tentativa);
                    System.out.print("\n");

                    estoque.alterar_quantidade_produto(codigo, quantidade);
                    break;
                case 4:
                    if (estoque.size() > 0) {
                        System.out.print("-- Lista de Produtos --");
                        System.out.print("\n\n");
                        estoque.listar_produtos();
                    } else {
                        System.out.print("Nem um produto encontrado!");
                    }
                    break;
                default:
                    System.out.print("Opção inválida. Tente novamente!");
                    break;
            }
            
        } while (!saida);
    }
}
