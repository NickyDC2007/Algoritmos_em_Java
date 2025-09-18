package Questões_Construtores_e_Modificadores_de_Acesso.Q01;

import java.util.Scanner;

/*
    Sistemas de Gerenciação de Times

    Programa em Java que simula a gestão de uma liga de times.
    É possível cadastrar e visualizar times, vincular técnicos, gerenciar torcedores 
    (incluindo sócios e pagamentos) e identificar o torcedor mais ativo.

    Estrutura:
    - AppQ1: controla o menu principal e a navegação da liga.
    - Liga: armazena e organiza os times cadastrados.
    - Time: gerencia as informações de cada time, seu técnico e seus torcedores.
    - Tecnico: define nome e anos de experiência do treinador.
    - Torcedores: representa os fãs, com jogos assistidos, se é sócio e pagamentos.
    - Fans: gerencia a lista de torcedores e funções relacionadas (sócios, pagamentos, estatísticas).
*/

public class AppQ1 {
    private boolean saida = false;
    private int escolha;
    
    public void main() {
        Scanner input = new Scanner(System.in);
        Liga liga = new Liga();

        liga.adicionar_time(new Time("Loud"));
        liga.adicionar_time(new Time("Pain"));
        liga.adicionar_time(new Time("Cloud 99"));

        while (saida == false) {
            System.out.print("\n");
            System.out.print(" ----- Liga Dos Times -----");
            System.out.print("\n\n");

            liga.printar_times();

            System.out.print("\n");
            System.out.print("[0] Sair");
            System.out.print("\n\n");

            System.out.print("Insira uma opção: ");
            escolha = input.nextInt();

            if(escolha == 0) {
                saida = true;
                input.close();
                return;
            } else if(escolha >= 1 && escolha <= liga.tamanho_liga()) {
                liga.verificar_times(escolha);
            } else {
                System.out.print("Insira uma opção válida!");
            }
        }
        input.close();
    }
}
