package Questões_Basicas.Q03;

import java.util.Scanner;

public class Calculadora {

    int operação;
    double primeiro_n, segundo_n;
    double resultado;

    Scanner input = new Scanner(System.in);

    public void calcular() {
        while (operação != 5) {
            System.out.print("\nSelecione uma opção: ");
            operação = input.nextInt();

            switch (operação) {
            case 1:
                System.out.print("Insira o primeiro número da adição: ");
                primeiro_n = input.nextDouble();
                System.out.print("Insira o segundo número da adição: ");
                segundo_n = input.nextDouble();
                resultado = primeiro_n + segundo_n;
                System.out.printf("O resultado da adição é %.2f\n", resultado);
                break;
            case 2:
                System.out.print("Insira o primeiro número da subtração: ");
                primeiro_n = input.nextDouble();
                System.out.print("Insira o segundo número da subtração: ");
                segundo_n = input.nextDouble();
                resultado = primeiro_n - segundo_n;
                System.out.printf("O resultado da subtração é %.2f\n", resultado);
                break;
            case 3:
                System.out.print("Insira o primeiro número da multiplicação: ");
                primeiro_n = input.nextDouble();
                System.out.print("Insira o segundo número da multiplicação: ");
                segundo_n = input.nextDouble();
                resultado = primeiro_n * segundo_n;
                System.out.printf("O resultado da multiplicação é %.2f\n", resultado);
                break;
            case 4:
                System.out.print("Insira o primeiro número da divisão: ");
                primeiro_n = input.nextDouble();
                System.out.print("Insira o segundo número da divisão: ");
                segundo_n = input.nextDouble();
                resultado = primeiro_n / segundo_n;
                System.out.printf("O resultado da divisão é %.2f\n", resultado);
                break;
            case 5:
                System.out.print("Saindo...");
                break;
            default:
                System.out.print("Comando desconhecido. Tente novamente.");
                break;
            }
        }
    }
}