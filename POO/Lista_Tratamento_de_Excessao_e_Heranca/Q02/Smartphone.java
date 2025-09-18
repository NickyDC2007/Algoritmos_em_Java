package Lista_Tratamento_de_Excessao_e_Heranca.Q02;

public class Smartphone extends ProdutoE {
    private int geracao;

    public Smartphone(String n, double p, int q,int id, int g) {
        super(n, p, q, id);
        this.geracao = g;
    }

    public void listar_produto() {
        System.out.printf("ID:%d) Nome do produto: %s | Preço do produto: %.2f | Quantidade do produto: %d | Geração do smartphone: %d", super.get_id(), super.get_nome(), super.get_preco(), super.get_quantidade(), this.geracao);
        System.out.print("\n");
    }
}
