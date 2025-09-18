package Lista_Heranca.Q02;

/*
    Programa de gerenciamento de produtos de uma loja.

    Estrutura:
    - Loja: armazena os produtos em um array de até 5 posições, controla o contador, permite adicionar, listar e procurar produtos.
    - Produto: super classe com nome, preço e código de barras.
    - Livro: herda Produto, adicionando o autor.
    - CD: herda Produto, adicionando o número de faixas.
    - DVD: herda Produto, adicionando a duração.

    Funcionamento:
    - A loja recebe produtos através de métodos específicos (adicionar_livros, adicionar_CD, adicionar_DVD).
    - O método listar_produtos imprime os detalhes de todos os produtos cadastrados.
    - O método procurar_produto busca pelo código de barras:
        - Se encontrar, exibe os detalhes e adiciona uma cópia do produto com novo código ("99999").
        - Se não encontrar, exibe "Produto não encontrado!".
    - Caso o estoque atinja o limite (5), o sistema informa "Sistema lotado".
*/

public class AppQ2 {
    public static void main(String[] args) {
        Loja shopping = new Loja();

        shopping.adicionar_livros(new Livro("Harry Potter", 69.99, "00001", "J.K. Rowling"));
        shopping.adicionar_livros(new Livro("Os Miseraveis", 124.89, "00002", "Victor Hugo"));
        shopping.adicionar_CD(new CD("Scoobydoo", 23.99, "00003", 2));
        shopping.adicionar_DVD(new DVD("Meu Malvado Favorito", 69.99, "00004", 1.9));

        System.out.print(" ---- Lista ----");
        System.out.print("\n\n");
        shopping.listar_produtos();
        System.out.print("\n");
        shopping.procurar_produto("00001");
        System.out.print("\n");
        System.out.print(" ---- Lista ----");
        System.out.print("\n\n");
        shopping.listar_produtos();
        System.out.print("\n");
        shopping.procurar_produto("99998");
        System.out.print("\n");
    }
}
