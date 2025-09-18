package Questões_Modificadores_de_Acesso.Q02;

/*
    Programa que gerencia um estoque de produtos.
    O nome sendo público (acesso direto) , enquanto o preço e quantidade são privadas (usa get/set).
    O estoque permite adicionar produtos, listar itens e calcular o valor total.
*/

public class AppQ2 {
    public static void main() {
        Estoque estoque = new Estoque();

        estoque.adicionar_produto(new Produto("Sabonete", 10.90, 24));
        estoque.adicionar_produto(new Produto("Nintendo Switch", 1590.80, 10));
        estoque.adicionar_produto(new Produto("Machado", 230.99, 22));
        estoque.adicionar_produto(new Produto("Shampo", 25.90, 14));
        estoque.adicionar_produto(new Produto("Madeira", 100.90, 225));

        estoque.mostrar_produto();
        System.out.print("\n");
        estoque.calcular_total();
    }
}
