package Lista_Tratamento_de_Excessao_e_Heranca.Q04;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Programa para gerenciamento de contatos como Whatsapp com menu no console.

    Estrutura:
    - Classe Contato: representa um contato comum com nome, telefone e email.
    - Classe Favorito: especialização de Contato que marca contatos como favoritos.
    - Classe ListaC: gerencia a coleção de contatos (adicionar, remover, listar).

    Funcionalidades:
    - Adicionar contato:
        • Nome do contato.
        • Telefone com no mínimo 8 dígitos.
        • Email contendo "@" como validação básica.
        • Definição se o contato será favorito.
    - Remover contato existente pelo telefone.
    - Listar todos os contatos cadastrados, diferenciando os favoritos.
    - Encerrar o programa através da opção do menu.

    Tratamento de exceções:
    - Uso de InputMismatchException para capturar entradas inválidas (quando não for número).
    - Validação de tamanho mínimo do telefone (8 dígitos).
    - Validação simples de email.
    - Limpeza do buffer do Scanner após cada leitura para evitar travamentos.
*/

public class AppQ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaC listac = new ListaC();

        boolean tentativa = false;
        boolean saida = false;
        int escolha;

        String nome = "";
        String s_telefone = "";
        int i_telefone = 0;
        String email = "";
        Boolean favorito = false;

        do {

            System.out.print("\n\n");
            System.out.print(" --- Whatsapp ---");
            System.out.print("\n\n");

            System.out.print("[1] Adicionar Contato");
            System.out.print("\n");
            System.out.print("[2] Remover Contato");
            System.out.print("\n");
            System.out.print("[3] Visualizar Contatos");
            System.out.print("\n\n");
            System.out.print("[0] Sair");
            System.out.print("\n\n");

            System.out.print("Insira uma opção válida: ");

            try {
                escolha = input.nextInt();
            } catch (InputMismatchException e) {
                escolha = 4;
            }

            input.nextLine();
            System.out.print("\n");

            switch (escolha) {
                case 0:
                    input.close();
                    saida = true;
                    break;
                case 1:
                    System.out.print(" -- Adicionar Contato -- ");
                    System.out.print("\n\n");

                    System.out.print("Insira o nome do contato: ");
                    nome = input.nextLine();
                    System.out.print("\n");

                    do {
                        try {
                            System.out.print("Insira o número de telefone do contato: ");
                            i_telefone = input.nextInt();

                            s_telefone = String.valueOf(i_telefone);

                            if (s_telefone.length() >= 8) {
                                tentativa = true;
                            } else {
                                System.out.print("Insira um número válido com 8 digitos!");
                                System.out.print("\n");
                                tentativa = false;
                            }
                        } catch (InputMismatchException e) {
                            System.out.print("Insira um número válido!");
                            System.out.print("\n");
                            tentativa = false;
                        }
                        input.nextLine();
                    } while (!tentativa);
                    System.out.print("\n");

                    do {
                        System.out.print("Insira o email do contato: ");
                        email = input.nextLine();

                        if (email.contains("@")) {
                            tentativa = true;
                        } else {
                            System.out.print("Insira um email válido!");
                            System.out.print("\n");
                            tentativa = false;
                        }
                    } while (!tentativa);
                    System.out.print("\n");

                    do {
                        System.out.print("O número de contato é favorito?");
                        System.out.print("\n\n");

                        System.out.print("[1] Sim");
                        System.out.print("\n");
                        System.out.print("[2] Não");
                        System.out.print("\n\n");
                        
                        System.out.print("Insira sua opção: ");
                        
                        try {
                            escolha = input.nextInt();
                        } catch (InputMismatchException e) {
                            escolha = 3;
                        }

                        switch (escolha) {
                            case 1:
                                favorito = true;
                                tentativa = true;
                                break;
                            case 2:
                                favorito = false;
                                tentativa = true;
                                break;
                            default:
                                System.out.print("Insira uma opção válida!");
                                tentativa = false;
                                break;
                        }
                    } while (!tentativa);
                    System.out.print("\n");

                    if (favorito == true) {
                        listac.adicionar_contato(new Favorito(nome, s_telefone, email));
                    } else {
                        listac.adicionar_contato(new Contato(nome, s_telefone, email));
                    }

                    System.out.print("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print(" -- Remover Contato -- ");
                    System.out.print("\n\n");

                    if (listac.size() > 0) {
                        do {
                            try {
                                System.out.print("Insira o número de telefone do contato a ser removido: ");
                                i_telefone = input.nextInt();

                                s_telefone = String.valueOf(i_telefone);

                                if (s_telefone.length() >= 8) {
                                    tentativa = true;
                                } else {
                                    System.out.print("Insira um número com 8 digitos!");
                                    System.out.print("\n");
                                    tentativa = false;
                                }
                            } catch (InputMismatchException e) {
                                System.out.print("Insira um número válido!");
                                System.out.print("\n");
                                tentativa = false;
                            }
                            input.nextLine();
                        } while (!tentativa);
                        System.out.print("\n");

                        listac.remover_contato(s_telefone);
                    } else {
                        System.out.print("Nenhum contato salvo!");
                    }
                    break;
                case 3:
                    System.out.println(" -- Listar Contatos -- ");
                    System.out.print("\n");
                    
                    if (listac.size() > 0) {
                        listac.listar_contatos();
                    } else {
                        System.out.print("Lista de contatos vazia!");
                    }
                    
                    break;
                default:
                    System.out.print("Opção inválida. Tente novamente!");
                    break;
            }
        } while (!saida);
    }
}