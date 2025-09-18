package Questões_Basicas.Q03;

import java.util.Scanner;

/*
 * Calculadora simples que executa as operações de
 * adição, subtração, multiplicação e divisão.
 * 
 * O usuário escolhe a operação e informa dois números.
 * O programa repete até que a opção de sair seja escolhida.
 */

public class AppQ3 {
    public static void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print(" ---- Calculadora ----\n\n[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Sair\n");

        calculadora.calcular();
        
        input.close();
    }
}
