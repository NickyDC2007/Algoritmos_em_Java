package Questões_Basicas.Q01;

public class Aluno {
    String nome;
    double nota1, nota2, nota3, nota4;
    double media;
    
    public void calcular_media() {
        media = (nota1 + nota2 + nota3 + nota4) / 4;
    }
    public void verificar_aprovacao() {
        if (media >= 7) {
            System.out.println("\nO aluno foi aprovado com exito");
        } else if (media < 5) {
            System.out.println("\nO aluno foi reprovado sem direito a recuperação");
        } else if (media >= 5 && media < 7) {
            System.out.println("\nO aluno ficou de recuperação");
        } else {
            System.out.println("\nA média foi calculada de forma erronia. Tente novamente.");
        }

    }
}
