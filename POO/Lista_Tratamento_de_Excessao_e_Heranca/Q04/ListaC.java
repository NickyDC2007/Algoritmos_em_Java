package Lista_Tratamento_de_Excessao_e_Heranca.Q04;

import java.util.ArrayList;

public class ListaC {
    ArrayList<Contato> listac = new ArrayList<>();

    public void adicionar_contato(Contato c) {
        listac.add(c);
    }

    public void listar_contatos() {
        for (Contato c : listac) {
            if (c instanceof Favorito) {
                ((Favorito) c).listar_contato();
                System.out.print("\n");
            }
        }

        for (Contato c : listac) {
            if (c instanceof Favorito) {
                
            } else {
                c.listar_contato();
                System.out.print("\n");
            }
        }

        System.out.print("\n");
        System.out.print("Todos os contatos na lista!");
    }

    public void remover_contato(String t) {
        for (Contato c : listac) {
            if (t.equals(c.get_telefone())) {
                listac.remove(c);
                System.out.print("Contato removido!");
                return;
            }
        }
        System.out.print("Contato não encontrado!");
    }

    public int size() {
        return listac.size();
    }
}
