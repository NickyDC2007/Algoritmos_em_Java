package Questões_Classe_E_Objetos.Q03;

import java.util.Random;
import java.util.Scanner;

/*
 * O programa simula uma conta bancaria (classe Conta_Bancaria)
 *
 * Funcionalidades:
 *  - Ler o nome do titular via Scanner
 *  - Exibir menu com operacoes: Depositar, Sacar, Saldo e Sair
 *  - Encaminhar valores para Conta_Bancaria.depositar(), sacar() e exibir_saldo()
 */

public class AppQ3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta_Bancaria conta = new Conta_Bancaria();
        Random randomico = new Random();

        double valor;

        System.out.print("Insira o nome do titular da conta: ");
        conta.titular = input.nextLine();

        conta.numero = randomico.nextInt(99999999); 

        System.out.printf("O número da conta do titular atual é %d", conta.numero);

        while (true) {
            System.out.printf("\n\n ------- Conta Corrente -------");
            System.out.printf("\nTitular: %s", conta.titular);
            System.out.printf("\nNúmero da Conta: %d", conta.numero);
            System.out.print("\n\n[1] Depositar");
            System.out.print("\n[2] Sacar");
            System.out.print("\n[3] Saldo");
            System.out.print("\n[4] Sair");
            System.out.print("\n\nEscolha uma opção: ");
            int o = input.nextInt();

            switch (o) {
                case 1:
                    System.out.print("Insira o valor a ser depositado: ");
                    valor = input.nextInt();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.print("Insira o valor a ser sacado: ");
                    valor = input.nextInt();
                    conta.sacar(valor);
                    break;
                case 3:
                    conta.exibir_saldo();
                    break;
                case 4:
                    input.close();
                    return;
                default:
                    System.out.print("Opção não existente. Tente novamente.");
                    break;
            }
        }
        
        
    }
}
