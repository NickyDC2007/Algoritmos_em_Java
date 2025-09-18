package Lista_Tratamento_de_Excessao_e_Heranca.Q02;

public class Vendas {
    private ProdutoE produto;
    private int nova_quantidade;
    private Estoque estoque;

    public Vendas(ProdutoE p, int nq, Estoque e) {
        this.produto = p;
        this.nova_quantidade = nq;
        this.estoque = e;
    }
    
    public void vender() {
        this.estoque.vender_produto(this.produto, this.nova_quantidade);
    }

    public Estoque get_estoque() {
        return estoque;
    }

    public int get_nova_quantidade() {
        return nova_quantidade;
    }

    public ProdutoE get_produto() {
        return produto;
    }
}
