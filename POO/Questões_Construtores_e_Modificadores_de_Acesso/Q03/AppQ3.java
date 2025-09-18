package Questões_Construtores_e_Modificadores_de_Acesso.Q03;

import java.util.Scanner;

/*
    Sistema de Garagem

    Programa em Java para gerenciar veiculos (Carro, Moto, Carreta).
    Permite adicionar, listar, calcular imposto individual e total.

    Estrutura:
    - AppQ4: menu principal e interacao com o usuario.
    - Veiculos: classe base com marca, anos de uso, valor e metodo de imposto.
    - Carro, Moto, Carreta: subclasses com regras especificas de imposto.
    - Garagem: armazena e gerencia a lista de veiculos.

    Funcionalidades:
    - Adicionar veiculos.
    - Listar veiculos cadastrados.
    - Exibir imposto individual de um veiculo.
    - Calcular imposto total da garagem.
*/

public class AppQ3 {
    public static void main() {
        Garagem cegonha = new Garagem();
        Scanner in = new Scanner(System.in);

        String marca;
        int ano;
        double valor;

        boolean saida = false;
        int escolha;

        while (saida == false) {
            System.out.print("\n\n");
            System.out.print(" ---- Garagem ----");
            System.out.print("\n\n");
            System.out.print("[1] Adicionar Veículos ");
            System.out.print("\n");
            System.out.print("[2] Exibir Veículos ");
            System.out.print("\n");
            System.out.print("[3] Mostrar Imposto Individual ");
            System.out.print("\n");
            System.out.print("[4] Mostrar Imposto Total ");
            System.out.print("\n\n");
            System.out.print("[0] Saída");
            System.out.print("\n\n");

            System.out.print("Insira uma opção válida: ");
            escolha = in.nextInt();
            in.nextLine();

            System.out.print("\n");

            switch (escolha) {
                case 1:
                    System.out.print("Qual tipo do seu veiculo: ");
                    System.out.print("\n\n");
                    System.out.print("[1] Carro ");
                    System.out.print("\n");
                    System.out.print("[2] Moto ");
                    System.out.print("\n");
                    System.out.print("[3] Carreta");
                    System.out.print("\n\n");

                    System.out.print("Insira uma opção válida: ");
                    escolha = in.nextInt();
                    in.nextLine();

                    System.out.print("\n");

                    System.out.print("Insira a marca do seu veículo: ");
                    marca = in.nextLine();

                    System.out.print("Insira quantos anos tem o seu veículo: ");
                    ano = in.nextInt();

                    System.out.print("Insira o valor do seu veículo: ");
                    valor = in.nextDouble();
                    
                    switch (escolha) {
                        case 1:
                            Carro carro = new Carro();
                            carro.set_veiculo(marca, ano, valor);
                            cegonha.adicionar_veiculo(carro);
                            break;
                        case 2:
                            Moto moto = new Moto();
                            moto.set_veiculo(marca, ano, valor);
                            cegonha.adicionar_veiculo(moto);
                            break;
                        case 3:
                            Carreta carreta = new Carreta();
                            carreta.set_veiculo(marca, ano, valor);
                            cegonha.adicionar_veiculo(carreta);
                            break;
                        default:
                            System.out.print("Opção inválida. Tente novamente!");
                            break;
                    }
                    break;
                case 2:
                    if (cegonha.size() > 0) {
                        cegonha.listar_veiculos();
                    } else {
                        System.out.print("Nem um veículo adicionado!");
                    }
                    break;
                case 3:
                    if (cegonha.size() > 0) {
                        cegonha.selecionar_veiculo1();

                        System.out.print("\n");
                        System.out.print("Insira uma opção válida: ");
                        escolha = in.nextInt();
                        System.out.print("\n");

                        cegonha.selecionar_veiculo2(escolha);
                    } else {
                        System.out.print("Nem um veículo adicionado!");
                    }
                    break;
                case 4:
                    if (cegonha.size() > 0) {
                        System.out.printf("A soma de todos os impostos da garagem são de R$ %.2f", cegonha.imposto_total());
                    } else {
                        System.out.print("Nem um veículo adicionado!");
                    }
                    break;
                case 0:
                    saida = true;
                    return;
                default:
                    System.out.print("Opção inválida. Tente novamente!");
                    break;
            }
        }
        in.close();
    }
        
}
