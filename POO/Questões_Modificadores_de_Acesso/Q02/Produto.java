package Questões_Modificadores_de_Acesso.Q02;

public class Produto {
    public String nome;
    private double preco;
    private int quantidade;

    public Produto(String n, double p, int q) {
        this.nome = n;
        this.preco = p;
        this.quantidade = q;
    }

    public void set_preco(double p) {
        this.preco = p;
    }

    public void set_quantidade(int q) {
        this.quantidade = q;
    }

    public double get_preco() {
        return preco;
    }

    public int get_quantidade() {
        return quantidade;
    }
}
