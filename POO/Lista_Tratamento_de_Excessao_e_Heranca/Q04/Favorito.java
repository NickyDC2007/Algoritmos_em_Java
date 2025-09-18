package Lista_Tratamento_de_Excessao_e_Heranca.Q04;

public class Favorito extends Contato {
    boolean favorito = true;

    public Favorito(String n, String t, String e) {
        super(n, t, e);
    }

    public void listar_contato() {
        System.out.printf("| * | Nome: %s | Telefone (91) 9%s | Email: %s", super.get_nome(), super.get_telefone(), super.get_email());
    }
}
