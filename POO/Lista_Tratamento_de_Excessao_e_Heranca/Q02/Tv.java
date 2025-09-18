package Lista_Tratamento_de_Excessao_e_Heranca.Q02;

public class Tv extends ProdutoE {
    private double tamanho;

    public Tv(String n, double p, int q, int id, double t) {
        super(n, p, q, id);
        this.tamanho = t;
    }

    public void listar_produto() {
        System.out.printf("ID:%d) Nome do produto: %s | Preço do produto: %.2f | Quantidade do produto: %d | Tamanho do televisor: %.1f pl",super.get_id(), super.get_nome(), super.get_preco(), super.get_quantidade(), this.tamanho);
        System.out.print("\n");
    }
}
