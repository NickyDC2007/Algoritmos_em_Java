package Lista_de_Treino.Q05;

import java.util.Scanner;

public class Elevador {
    int total_de_andares, andar_atual, capacidade_pessoas_max, quantidade_de_pessoas, escolha;

    int v1, v2;

    Scanner input = new Scanner(System.in);

    public void Subir_Descer() {

        v1 = 1;

        while (v1 == 1) {
            System.out.print("\n - Mudança de andar - ");
            System.out.print("\n\n[1] Subir");
            System.out.print("\n[2] Descer");
            System.out.print("\n[3] Sair");
            System.out.print("\n\nEscolha uma opção: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    if (andar_atual >= total_de_andares) {
                        System.out.print("\nO elevador chegou no andar limite, não a como chegar em andares mais elevados");
                    } else {
                        andar_atual++;
                    }
                    break;
            
                case 2:
                    if (andar_atual <= 0) {
                        System.out.print("\nO elevador está no térreo, não a como chegar em andares mais baixos");
                    } else {
                        andar_atual--;
                    }
                    break;
                case 3:
                    v1 = 0;
                    break;
                default:
                    System.out.print("\nInsira uma opção valida. Tente novamente");
                    break;
            }
        }
    }
    public void Entrar_Sair() {

        v2 = 1;

        while (v2 == 1) {
            System.out.print("\n - Alteração de pessoas - ");
            System.out.print("\n\n[1] Adicionar");
            System.out.print("\n[2] Subtrair");
            System.out.print("\n[3] Sair");
            System.out.print("\n\nEscolha uma opção: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    if (quantidade_de_pessoas >= capacidade_pessoas_max) {
                        System.out.print("\nO elevador chegou no limite de carga, não a como adicionar mais pessoas");
                    } else {
                        quantidade_de_pessoas++;
                    }
                    break;
                case 2:
                    if (quantidade_de_pessoas <= 0) {
                        System.out.print("\nA quantidade de pessoas ja é zero, não a como subtrair mais pessoas");
                    } else {
                        quantidade_de_pessoas--;
                    }
                    break;
                case 3:
                    v2 = 0;
                    break;
                default:
                    System.out.print("\nInsira uma opção valida. Tente novamente");
                    break;
            }
        }
    }
}   
