package Questões_Construtores_e_Modificadores_de_Acesso.Q02;

import java.util.ArrayList;

public class Pokedex {
    ArrayList<Pokemon> pokedex = new ArrayList<>();

    public void adicionar_pokemon(Pokemon p) {
        pokedex.add(p);
    }

    public int tamanho_dex() {
        return pokedex.size();
    }

    public void listar_pokemon() {
        int i = 1;

        for (Pokemon pokemon : pokedex) {
            System.out.printf("[%d] %s", i, pokemon.nome_p());
            System.out.print("\n");
            i++;
        }

        System.out.print("\n");

        System.out.print("[0] Sair");
    }

    public void selecionar_pokemon(int escolha) {
        int i = 1;

        for (Pokemon pokemon : pokedex) {
            if (i == 0) {
                return;
            } else if (i == escolha) {
                System.out.printf("- %s -", pokemon.nome_p());

                System.out.print("\n\n");

                System.out.printf("Vida Máxima: %d/%d", pokemon.vida_a_p(),pokemon.vida_m_p());

                System.out.print("\n\n");

                System.out.printf("Vida Base: %d", pokemon.vida_s_p());
                System.out.print("\n");
                System.out.printf("Ataque Físico: %d", pokemon.ataque_f_p());
                System.out.print("\n");
                System.out.printf("Ataque Especial: %d", pokemon.ataque_e_p());
                System.out.print("\n");
                System.out.printf("Defesa Física: %d", pokemon.defesa_f_p());
                System.out.print("\n");
                System.out.printf("Defesa Especial: %d", pokemon.defesa_e_p());
                System.out.print("\n");
                System.out.printf("Velocidade: %d", pokemon.velocidade_p());
            }
            i++;
        }
    }

    public double media_pokemon() {
        double media = 0;

        for (Pokemon pokemon : pokedex) {
            media = media + pokemon.media_status();
        }

        return media / tamanho_dex();
    }

    public void maior_pokemon() {
        String nome = "";
        int maior = 0;
        boolean primeiro = false;

        for (Pokemon pokemon : pokedex) {
            if (primeiro == false) {
                nome = pokemon.nome_p();
                maior = pokemon.soma_status();
                primeiro = true;
            } else {
                if (maior < pokemon.soma_status()) {
                    nome = pokemon.nome_p();
                    maior = pokemon.soma_status();
                }
            }
        }

        System.out.printf("O Pokémon com maior status é o %s com %d status base", nome, maior);
    }

    public void curar_pokemon(int escolha) {
        int i = 1;
        for (Pokemon pokemon : pokedex) {
            if (i == 0) {
                return;
            } else if (i == escolha) {
                if (pokemon.vida_m_p() == pokemon.vida_a_p()) {
                    System.out.print("O Pokémon ja está com sua vida ao maximo!");
                } else {
                    pokemon.mudar_vida_a(pokemon.curar_vida(pokemon.vida_a_p(), pokemon.vida_m_p()));
                    System.out.printf("O Pokémon %s foi totalmente curado!", pokemon.nome_p());
                }
            }
        }
    }

    
}
