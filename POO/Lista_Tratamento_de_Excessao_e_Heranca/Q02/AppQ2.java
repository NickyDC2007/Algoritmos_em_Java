package Lista_Tratamento_de_Excessao_e_Heranca.Q02;

/*
    Programa para gerenciamento de estoque e vendas de produtos eletrônicos.

    Estrutura:
    - Classe ProdutoE: representa um produto genérico do estoque.
    - Subclasses: Smartphone, Laptop e Tv com atributos específicos.
    - Classe Estoque: gerencia os produtos disponíveis.
    - Classe Vendas: processa transações de venda, atualizando o estoque.
    - Classe Carrinho: armazena itens adicionados para compra e calcula o total.

    Funcionalidades:
    - Adicionar produtos ao estoque.
    - Alterar a quantidade de um produto existente.
    - Listar todos os produtos cadastrados.
    - Adicionar produtos ao carrinho de compras.
    - Calcular o valor total da compra.
    - Realizar a venda e atualizar o estoque.
*/

public class AppQ2 {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Carrinho carrinho = new Carrinho();

        estoque.adicionar_produto(new ProdutoE("Livro", 42.90, 12, 1));
        estoque.adicionar_produto(new Smartphone("Iphone 17", 19389.90, 0, 2, 17));
        estoque.adicionar_produto(new Laptop("Galaxy Book4 360", 7654, 7, 3, "Samsung"));
        estoque.adicionar_produto(new Tv("SmartTv 6", 10002, 9, 4, 45));

        ProdutoE p = new ProdutoE("Quadro", 567, 6, 5);
        estoque.adicionar_produto(p);

        Smartphone s = new Smartphone("Sansung S25", 9023, 15, 6, 16);
        estoque.adicionar_produto(s);

        estoque.alterar_quantidade("Iphone 17", 99);

        estoque.listar_produtos();

        carrinho.adicionar_carrinho(new Vendas(p, 2, estoque));
        carrinho.adicionar_carrinho(new Vendas(s, 2, estoque));
        carrinho.calcular_carrinho();
        carrinho.vender_carrinho();

        estoque.listar_produtos();
    }
}