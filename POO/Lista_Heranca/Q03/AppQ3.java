package Lista_Heranca.Q03;

/*
    Sistema de gerenciamento de itens de uma biblioteca.

    Estrutura:
    - Biblioteca: armazena os itens em uma lista (ArrayList) e oferece métodos para adicionar, listar e buscar itens.
    - Item_Biblioteca: super classe que representa um item genérico com título, ano e tipo).
    - Livro: herda Item_Biblioteca, adicionando autor e gênero.
    - Revista: herda Item_Biblioteca, adicionando número da edição e volume.

    Funcionamento:
    - Os métodos adicionar_item, adicionar_livro e adicionar_revista permitem incluir diferentes tipos de itens na lista.
    - O método listar_itens percorre o ArrayList e exibe os detalhes de cada item (Livro, Revista ou genérico).
    - O método buscar_itens_tipos filtra os itens pelo tipo (ex.: "Livro") e mostra apenas aqueles correspondentes, além de contar quantos itens desse tipo existem com função recursiva.
    - O método contar_tipos utiliza recursão para contabilizar a quantidade de itens de um tipo específico.
*/


public class AppQ3 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionar_item(new Item_Biblioteca("Computing Machinery and Intelligence", 1950));
        biblioteca.adicionar_item(new Item_Biblioteca("Jornal", 2025));
        biblioteca.adicionar_livro(new Livro("The Moomies", 1953, "Tovy", "Infantil"));
        biblioteca.adicionar_livro(new Livro("Harry Potter", 2007, "J.K. Rowling", "Fantasia"));
        biblioteca.adicionar_revista(new Revista("New York Times", 2023, 143, 2));
        biblioteca.adicionar_revista(new Revista("Veja", 2018, 44, 1));

        System.out.print(" ---- Itens ----");
        System.out.print("\n\n");
        biblioteca.listar_itens();
        System.out.print("\n");
        biblioteca.buscar_itens_tipos("Livro");

    }
}
