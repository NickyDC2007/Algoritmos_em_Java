package Questões_Basicas.Q02;

import java.util.Random;

public class Jogo {

    int chute;
    int cem_numero;
    int ganhar;

    public void gerar_numero() {
        Random randomico = new Random();
        cem_numero = randomico.nextInt(101);
    }

    public void acertar_numero() {

        if (chute > cem_numero) {
            System.out.print("O número escolhido é maior que o número sorteado");
        } else if (chute < cem_numero){
            System.out.print("O número escolhido é menor que o número sorteado");
        } else {
            System.out.print("Parabens! Voce acertou o numero!");
            ganhar ++;
        }
    }
}