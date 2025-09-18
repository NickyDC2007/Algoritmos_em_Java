package Questões_Construtores_e_Modificadores_de_Acesso.Q01;

import java.util.ArrayList;

public class Fans {
    ArrayList<Torcedores> fans = new ArrayList<>();
    
    public void adicionar_torcedores(Torcedores t) {
        fans.add(t);
    }

    public void printar_torcedores() {
        int i = 1;
        for (Torcedores torcedores : fans) {
            System.out.printf("[%d] %s", i, torcedores.get_nome_torcedores());
            System.out.print("\n");
            i++;
        }
    }

    public void printar_socios() {
        int i = 1;
        for (Torcedores torcedores : fans) {
            if (torcedores.get_socio() == true) {
                System.out.printf("[%d] %s", i, torcedores.get_nome_torcedores());
                System.out.print("\n");
                i++;
            }
        }
    }

    public void selecionar_socio_p(int escolha, int q_pagamentos) {
        int i = 1;
        for (Torcedores torcedores : fans) {
            if (torcedores.get_socio() == true) {
                if (i == escolha) {
                    torcedores.set_q_pagamentos(q_pagamentos);
                }
                i++;
            }
        }
    }

    public void selecionar_socio_q(int escolha) {
        int i = 1;
        for (Torcedores torcedores : fans) {
            if (torcedores.get_socio() == true) {
                if (i == escolha) {
                    System.out.printf("O sócio %s pagou %d parcelas", torcedores.get_nome_torcedores(), torcedores.get_q_pagamentos());
                }
                i++;
            }
        }
    }

    public void maior_torcedor() {
        boolean primeiro = false;
        int maior = 0;
        String nome = "";

        for (Torcedores torcedores : fans) {
            if (primeiro == false) {
                maior = torcedores.get_jogos_assistidos();
                nome = torcedores.get_nome_torcedores();
                primeiro = true;
            } else {
                if (maior < torcedores.get_jogos_assistidos()) {
                    maior = torcedores.get_jogos_assistidos();
                    nome = torcedores.get_nome_torcedores();
                }
            }
        }
        System.out.printf("O torcedor mais viciado é %s, com %d jogos vistos", nome, maior);
    }
}
