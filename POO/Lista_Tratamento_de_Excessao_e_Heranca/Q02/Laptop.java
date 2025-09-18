package Lista_Tratamento_de_Excessao_e_Heranca.Q02;

public class Laptop extends ProdutoE{
    public String marca;

    public Laptop(String n, double p, int q,int id, String m) {
        super(n, p, q, id);
        this.marca = m;
    }

    public void listar_produto() {
        System.out.printf("ID:%d) Nome do produto: %s | Preço do produto: %.2f | Quantidade do produto: %d | Marca do laptop: %s", super.get_id(), super.get_nome(), super.get_preco(), super.get_quantidade(), this.marca);
        System.out.print("\n");
    }
}
