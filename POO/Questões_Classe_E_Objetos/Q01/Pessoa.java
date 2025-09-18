package Questões_Classe_E_Objetos.Q01;

public class Pessoa {
    String nome;
    int idade;
    
    public void inserir_dados(String n, int i) {
        this.nome = n;
        this.idade = i;
    }

    public void exibir_dados() {
        System.out.printf("\nO nome do usuário é %s", this.nome);
        System.out.printf("\nA idade do usuário é %d", this.idade);
    }

}
