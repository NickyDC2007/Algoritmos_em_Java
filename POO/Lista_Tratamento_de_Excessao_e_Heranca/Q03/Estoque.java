package Lista_Tratamento_de_Excessao_e_Heranca.Q03;

import java.util.ArrayList;
import java.util.Random;

public class Estoque {
    ArrayList<Produto> estoque = new ArrayList<>();
    Random random = new Random();
   
    public void adicionar_produto(Produto p) {
        estoque.add(p);
    }

    public int gerar_codigo() {
        int c = random.nextInt(10000);

        for (Produto p : estoque) {
            if (c == p.get_codigo()) {
                return gerar_codigo();
            }
        }

        return c;
    }

    public void alterar_quantidade_produto(int c, int nq) {
        for (Produto p : estoque) {
            if (c == p.get_codigo()) {
                p.set_nova_quantidade(nq);
                System.out.print("Quantidade alterada com sucesso!");
                return;
            }
        }
        System.out.print("Produto não encontrado!");
    }

    public void remover_produto(int c) {
        for (Produto p : estoque) {
            if (c == p.get_codigo()) {
                estoque.remove(p);
                System.out.print("Produto removido com sucesso!");
                return;
            }
        }
        System.out.print("Produto não encontrado!");
    }

    public void listar_produtos() {
        for (Produto p : estoque) {
            System.out.printf("| Nome: %s | Código: %d | Quantidade: %d | Preço: %.2f |", p.get_nome(), p.get_codigo(), p.get_quantidade(), p.getpreco());
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("Todos os produtos adicionados!");
    }

    public int size() {
        return estoque.size();
    }
}
