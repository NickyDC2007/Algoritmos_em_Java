package Lista_Tratamento_de_Excessao_e_Heranca.Q02;

public class ProdutoE {

    private String nome;
    private double preco;
    private int quantidade;
    private int id;

    public ProdutoE(String n, double p, int q, int id) {
        this.nome = n;
        this.preco = p;
        this.quantidade = q;
        this.id = id;
    }

    public void set_quantidade(int q) {
        this.quantidade = q;
    }

    public String get_nome() {
        return this.nome;
    }

    public double get_preco() {
        return this.preco;
    }

    public int get_quantidade() {
        return this.quantidade;
    }

    public int get_id() {
        return this.id;
    }

    public void listar_produto() {
        System.out.printf("ID:%d) Nome do produto: %s | Preço do produto: %.2f | Quantidade do produto: %d", this.id, this.nome, this.preco, this.quantidade);
        System.out.print("\n");
    }
}