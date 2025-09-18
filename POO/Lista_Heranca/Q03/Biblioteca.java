package Lista_Heranca.Q03;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Item_Biblioteca> Itens = new ArrayList<>();

    public void adicionar_item(Item_Biblioteca ib) {
        Itens.add(ib);
    }

    public void adicionar_livro(Livro v) {
        Itens.add(v);
    }

    public void adicionar_revista(Revista r) {
        Itens.add(r);
    }

    public void listar_itens() {
        for (Item_Biblioteca ib : Itens) {
            if (ib instanceof Livro) {
                ((Livro) ib).exibir_detalhes();
                System.out.print("\n");
            } else if (ib instanceof Revista) {
                ((Revista) ib).exibir_detalhes();
                System.out.print("\n");
            } else {
                ib.exibir_detalhes();
                System.out.print("\n");
            }
        }
    }

    public void buscar_itens_tipos(String tipo) {
        System.out.printf(" ---- %s ----", tipo);
        System.out.print("\n\n");
        for (Item_Biblioteca ib : Itens) {
            if (tipo.equals(ib.get_tipo())) {
                System.out.printf("[Tipo: %s] %s", ib.get_tipo(), ib.get_titulo());
                System.out.print("\n");
            }
        }
        System.out.print("\n");
        System.out.printf("Atualmente tendo %d %s", contar_tipos(tipo, 0), tipo);
    }

    public int contar_tipos(String tipo, int i) {
        int c = 0;
        for (Item_Biblioteca ib : Itens) {
            if (ib.get_tipo().equals(tipo)) {
                c++;
                if (c > i) {
                    return contar_tipos(tipo, i + 1);
                }
            }
        }
        return i;
    }
}
