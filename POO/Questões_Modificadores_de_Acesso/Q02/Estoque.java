package Questões_Modificadores_de_Acesso.Q02;

import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> Estoque = new ArrayList<>();

    public void adicionar_produto(Produto p) {
        Estoque.add(p);
    }

    public void mostrar_produto() {
        for (Produto produto : Estoque) {
            System.out.printf("Produto: %s | Preço: %.2f | Quantidade %d", produto.nome, produto.get_preco(), produto.get_quantidade());
            System.out.print("\n");
        }
    }

    public void calcular_total() {
        double soma = 0;
        for (Produto produto : Estoque) {
            soma = soma + produto.get_preco() * produto.get_quantidade();
        }
        System.out.printf("O total de estoque é de R$%.2f", soma);
    }
}
