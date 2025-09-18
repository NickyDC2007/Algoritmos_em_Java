package Lista_Tratamento_de_Excessao_e_Heranca.Q02;

import java.util.ArrayList;

public class Estoque {
    ArrayList<ProdutoE> estoque = new ArrayList<>();

    public void adicionar_produto(ProdutoE p) {
        estoque.add(p);
    }

    public void listar_produtos() {
        for (ProdutoE produto : estoque) {
            if (produto instanceof Smartphone) {
                ((Smartphone) produto).listar_produto();
            } else if (produto instanceof Tv) {
                ((Tv) produto).listar_produto();
            } else if (produto instanceof Laptop) {
                ((Laptop) produto).listar_produto();
            } else {
                produto.listar_produto();
            }
        }
    }

    public void alterar_quantidade(String n, int q) {
        for (ProdutoE produto : estoque) {
            if (n.equals(produto.get_nome())) {
                produto.set_quantidade(q);
                System.out.print("Quantidade alterada com sucesso!");
                System.out.print("\n\n");
                return;
            } 
        }

        System.out.print("Produto não encontrado!");
        System.out.print("\n\n");
    }

    public void vender_produto(ProdutoE p, int q) {
        for (ProdutoE produto : estoque) {
            if (p.equals(produto)) {
                q = produto.get_quantidade() - q;
                produto.set_quantidade(q);
                return;
            } 
        }

        System.out.print("Produto não encontrado!");
        System.out.print("\n\n");
    }
}
