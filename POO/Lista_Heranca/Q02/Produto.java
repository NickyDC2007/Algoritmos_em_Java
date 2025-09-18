package Lista_Heranca.Q02;

public class Produto {
    private String nome;
    private double preco;
    private String codigo_barras;

    public Produto(String n, double p, String c) {
        this.nome = n;
        this.preco = p;
        this.codigo_barras = c;
    }

    public String get_nome() {
        return this.nome;
    }

    public double get_preco() {
        return this.preco;
    }
    
    public String get_codigo_barras() {
        return this.codigo_barras;
    }
}
