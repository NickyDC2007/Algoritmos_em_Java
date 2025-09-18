package Lista_Tratamento_de_Excessao_e_Heranca.Q03;

public class Produto {
    private String nome;
    private int codigo;
    private int quantidade;
    private double preco;

    public Produto(String n,int c, int q, double p) {
        this.nome = n;
        this.codigo = c;
        this.quantidade = q;
        this.preco = p;
    }

    public void set_nova_quantidade(int nq) {
        this.quantidade = nq;
    }

    public String get_nome() {
        return this.nome;
    }

    public int get_codigo() {
        return this.codigo;
    }

    public int get_quantidade() {
        return this.quantidade;
    }

    public double getpreco() {
        return this.preco;
    }
}
