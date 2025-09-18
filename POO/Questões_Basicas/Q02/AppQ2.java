package Questões_Basicas.Q02;

import java.util.Scanner;

/*
 * Programa que sorteia um número entre 0 e 100
 * e permite ao usuário até 5 tentativas para acertar.
 * 
 * Mostra se o chute é maior ou menor que o número sorteado
 * e encerra quando o usuário acerta ou acaba o número de tentativas.
 */

public class AppQ2 {
    public static void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Jogo random = new Jogo();

        random.gerar_numero();

        for(int i = 0; i != 5; i++){
            if (random.ganhar == 1) {
                break;
            }

            System.out.print("\nInsira o número entre o intervalo de 0 a 100: ");
            random.chute = input.nextInt();

            random.acertar_numero();
        }

        if (random.ganhar != 1) {
            System.out.printf("\nVocê perdeu, o número era %d", random.cem_numero);
        }       

        input.close();
    }
}
