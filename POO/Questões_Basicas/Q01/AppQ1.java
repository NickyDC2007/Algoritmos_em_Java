package Questões_Basicas.Q01;

import java.util.Scanner;

/* 
 * O código lê o nome e as notas de um aluno
 * calcula a média e informa se ele foi aprovado, reprovado ou está de recuperação.
 */

public class AppQ1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Insira seu nome completo: ");
        aluno.nome = input.nextLine();

        System.out.print("\nInsira sua primeira nota: ");
        aluno.nota1 = input.nextDouble();
        System.out.print("Insira sua segunda nota: ");
        aluno.nota2 = input.nextDouble();
        System.out.print("Insira sua terceira nota: ");
        aluno.nota3 = input.nextDouble();
        System.out.print("Insira sua quarta nota: ");
        aluno.nota4 = input.nextDouble();

        aluno.calcular_media();
        aluno.verificar_aprovacao();
        
        input.close();
    }
}