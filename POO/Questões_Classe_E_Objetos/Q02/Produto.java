package Questões_Classe_E_Objetos.Q02;

public class Produto {
    String nome;
    int quantidade;
    double preço;

    public void inserir_dados(String n, int q, double p) {
        this.nome = n;
        this.quantidade = q;
        this.preço = p;
    }

    public void mostrar_dados(int i) {
        System.out.print("---------------");
        System.out.printf("\n%d° Produto", i + 1);
        System.out.printf("\n\nNome do produto: %s", this.nome);
        System.out.printf("\nQuantidade do produto: %d", this.quantidade);
        System.out.printf("\nPreço do produto: %.2f", this.preço);
        System.out.print("\n");
        System.out.print("---------------");
        System.out.print("\n\n");
    }
}
