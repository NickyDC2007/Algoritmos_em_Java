package Questões_Construtores_e_Modificadores_de_Acesso.Q01;

import java.util.Scanner;

public class Time {
    private String nome_time;
    
    public Time(String nome) {
        this.nome_time = nome;
    }

    public String get_nome_time() {
        return this.nome_time;
    }

    public void info_time() {
        Scanner input = new Scanner(System.in);
        Tecnico tecnico = new Tecnico();
        Fans fans = new Fans();

        fans.adicionar_torcedores(new Torcedores("Ronald Bruno", 2, false));
        fans.adicionar_torcedores(new Torcedores("José Milton", 40, false));
        fans.adicionar_torcedores(new Torcedores("Luca Rodrigues", 25, true));
        fans.adicionar_torcedores(new Torcedores("João Henrique", 12, true));
        fans.adicionar_torcedores(new Torcedores("Pedro Antonio", 31, true));

        boolean saida = false;
        int escolha;

        String nome;
        int experiencia;

        int q_pagamentos;

        while (saida == false) {
            System.out.print("\n");
            System.out.printf(" --- %s ---", get_nome_time());
            System.out.print("\n\n");

            System.out.print("[1] Vincular Tecnico");
            System.out.print("\n");
            System.out.print("[2] Verificar Tecnico");
            System.out.print("\n");
            System.out.print("[3] Lista de Torcedores");
            System.out.print("\n");
            System.out.print("[4] Pagamentos");
            System.out.print("\n");
            System.out.print("[5] Verificar Pagamentos");
            System.out.print("\n");
            System.out.print("[6] Torcedor mais Viciado");
            System.out.print("\n\n");
            System.out.print("[0] Sair");
            System.out.print("\n\n");

            System.out.print("Insira uma opção: ");
            escolha = input.nextInt();

            input.nextLine();

            System.out.print("\n");

            switch (escolha) {
                case 0:
                    saida = true;
                    return;
                case 1:
                    System.out.print(" -- Novo Tecnico --");
                    System.out.print("\n\n");
                    
                    System.out.print("Insira o nome do novo tecnico: ");
                    nome = input.nextLine();

                    System.out.print("Insira a experiência em anos do novo tecnico: ");
                    experiencia = input.nextInt();

                    tecnico.set_tecnico(nome, experiencia);
                    break;
                case 2:
                    System.out.print(" -- Informações do Tecnico --");
                    System.out.print("\n\n");

                    System.out.printf("O tecnico atual é %s", tecnico.get_nome_tecnico());
                    System.out.print("\n");
                    System.out.printf("A experiência do tecnico atual é de %d anos", tecnico.get_anos_experiencia());
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.print(" -- Todos os Torcedores --");
                    System.out.print("\n\n");

                    fans.printar_torcedores();
                    break;
                case 4:
                    System.out.print(" -- Atribuição de Pagamentos --");
                    System.out.print("\n\n");

                    fans.printar_socios();

                    System.out.print("\n");
                    System.out.print("Insira uma opção: ");
                    escolha = input.nextInt();
                    System.out.print("\n");

                    System.out.print("Insira quantos pagamentos foram pagos: ");
                    q_pagamentos = input.nextInt();
                    System.out.print("\n");

                    fans.selecionar_socio_p(escolha, q_pagamentos);

                    System.out.print("Pagamento finalizado!");
                    System.out.print("\n");
                    break;
                case 5:
                    System.out.print(" -- Visualização de Pagamentos --");
                    System.out.print("\n\n");

                    fans.printar_socios();

                    System.out.print("\n");
                    System.out.print("Insira uma opção: ");
                    escolha = input.nextInt();
                    System.out.print("\n");

                    fans.selecionar_socio_q(escolha);
                    System.out.print("\n");
                    break;
                case 6:
                    System.out.print(" -- Torcedor mais Viciado --");
                    System.out.print("\n\n");
                    fans.maior_torcedor();
                    System.out.print("\n");
                    break;
                default:
                    System.out.print("Insira uma opção válida!");
                    System.out.print("\n");
                    break;
            }
        }
        input.close();
    }
}
