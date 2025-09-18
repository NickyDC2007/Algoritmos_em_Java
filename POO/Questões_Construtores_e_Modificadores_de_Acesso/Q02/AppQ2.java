package Questões_Construtores_e_Modificadores_de_Acesso.Q02;

import java.util.Scanner;

/*
    Sistema: Pokédex

    Programa em Java que simula uma Pokédex interativa.
    Permite capturar Pokémons, visualizar informações detalhadas, 
    calcular médias de status, encontrar o Pokémon com maior status 
    e curar os Pokémons.

    Estrutura:
    - AppQ2: controla o menu principal e a interação com o usuário.
    - Pokemon: representa cada Pokémon,
    armazenando seus atributos (nome, vida, ataques, defesas, velocidade).
    - Pokedex: gerencia a lista de Pokémons
    capturados e fornece operações como adicionar, listar, curar e
    calcular estatísticas.

    Funcionalidades principais:
    - Capturar novos Pokémons com atributos personalizados.
    - Listar Pokémons cadastrados e exibir detalhes de um escolhido.
    - Calcular a média de status de todos os Pokémons da Pokédex.
    - Identificar o Pokémon com maior status.
    - Curar a vida de um Pokémon selecionado.
*/

public class AppQ2 {

    private int escolha;
    private int escolha_p;
    private boolean saida = false;

    private String nome_p;
    private int vida_s;
    private int ataque_f;
    private int ataque_e;
    private int defesa_f;
    private int defesa_e;
    private int velocidade;

    private int vida_a;
    private int vida_m;

    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pokedex pokedex = new Pokedex();

        while (saida == false) {
            System.out.print("\n\n");
            System.out.print(" ---- Pokédex ----");
            System.out.print("\n\n");

            System.out.print("[1] Adicionar Pokémon's");
            System.out.print("\n");
            System.out.print("[2] Verificar Pokémon's");
            System.out.print("\n");
            System.out.print("[3] Média de Status");
            System.out.print("\n");
            System.out.print("[4] Maior Status");
            System.out.print("\n");
            System.out.print("[5] Curar Pokémon's");
            System.out.print("\n\n");
            System.out.print("[0] Sair");
            System.out.print("\n\n");

            System.out.print("Insira sua opção: ");
            escolha = input.nextInt();

            input.nextLine();

            System.out.print("\n");

            switch (escolha) {
                case 0:
                    saida = true;
                    return;
                case 1:
                    System.out.print(" -- Capturar Pokémons --");

                    System.out.print("\n\n");

                    System.out.print("Insira o nome do Pokémon capturado: ");
                    nome_p = input.nextLine();

                    System.out.print("\n");

                    System.out.print("Insira a quantidade de vida atual do Pokémon adicionado: ");
                    vida_a = input.nextInt();
                    System.out.print("Insira a quantidade de vida maxíma do Pokémon adicionado: ");
                    vida_m = input.nextInt();

                    System.out.print("\n");

                    System.out.print("Insira o status de vida do Pokémon adicionado: ");
                    vida_s = input.nextInt();
                    System.out.print("Insira o status de ataque físico do Pokémon adicionado: ");
                    ataque_f = input.nextInt();
                    System.out.print("Insira o status de ataque especial do Pokémon adicionado: ");
                    ataque_e = input.nextInt();
                    System.out.print("Insira o status de defesa física do Pokémon adicionado: ");
                    defesa_f = input.nextInt();
                    System.out.print("Insira o status de defesa especial do Pokémon adicionado: ");
                    defesa_e = input.nextInt();
                    System.out.print("Insira o status de velocidade do Pokémon adicionado: ");
                    velocidade = input.nextInt();

                    Pokemon pokemon = new Pokemon(nome_p, vida_s, ataque_f, ataque_e, defesa_f, defesa_e, velocidade, vida_a, vida_m);
                    pokedex.adicionar_pokemon(pokemon);
                    
                    System.out.print("\n");
                    
                    System.out.print("Pokémon adicionado na Pokédex!");
                    break;
                case 2:
                    if (pokedex.tamanho_dex() > 0) {
                        System.out.print(" -- Listar Pokémons --");

                        System.out.print("\n\n");

                        pokedex.listar_pokemon();

                        System.out.print("\n\n");

                        System.out.print("Escolha um Pokémon a ser analisado: ");
                        escolha_p = input.nextInt();

                        System.out.print("\n");

                        pokedex.selecionar_pokemon(escolha_p);
                    } else {
                        System.out.print("Nem um Pokémon capturado!");
                    }
                    break;
                case 3:
                    if (pokedex.tamanho_dex() > 0) {
                        System.out.print(" -- Média de Status --");

                        System.out.print("\n\n");

                        System.out.printf("A média do Status de todos os Pokémons capturados são de %.2f", pokedex.media_pokemon());
                    } else {
                        System.out.print("Nem um Pokémon capturado para fazer média!");
                    }
                    break;
                case 4:
                    if (pokedex.tamanho_dex() > 0) {
                        System.out.print(" -- Maior Status --");

                        System.out.print("\n\n");

                        pokedex.maior_pokemon();
                    } else {
                        System.out.print("Nem um Pokémon capturado para comparar status!");
                    }
                    break;
                case 5:
                    if (pokedex.tamanho_dex() > 0) {
                        System.out.print(" -- Curar Pokémon --");

                        System.out.print("\n\n");

                        pokedex.listar_pokemon();

                        System.out.print("\n\n");

                        System.out.print("Escolha um Pokémon a ser curado: ");
                        escolha_p = input.nextInt();

                        System.out.print("\n");

                        pokedex.curar_pokemon(escolha_p);
                    } else {
                        System.out.print("Nem um Pokémon capturado para curar!");
                    }
                    break;
                default:
                    System.out.print("Opção inválida. Tente novamente");
                    break;
            }
        }
        input.close();
    }
}