package Lista_Tratamento_de_Excessao_e_Heranca.Q02;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Vendas> carrinho = new ArrayList<>();

    public void adicionar_carrinho(Vendas v) {
        carrinho.add(v);
    }

    public void calcular_carrinho() {
        double pt = 0;
        for (Vendas vendas : carrinho) {
            pt = vendas.get_produto().get_preco() * vendas.get_nova_quantidade() + pt;
        }
        System.out.print("\n");
        System.out.printf("O preço total do carrinho é de %.2f", pt);
        System.out.print("\n\n");
    }

    public void vender_carrinho() {
        for (Vendas vendas : carrinho) {
            vendas.vender();
        }
        System.out.print("Produtos vendidos com sucesso!");
        System.out.print("\n\n");
    }
}
