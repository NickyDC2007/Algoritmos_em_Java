package Lista_Tratamento_de_Excessao_e_Heranca.Q04;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String n, String t, String e) {
        this.nome = n;
        this.telefone = t;
        this.email = e;
    }

    public void listar_contato() {
        System.out.printf("| Nome: %s | Telefone (91) 9%s | Email: %s", this.nome, this.telefone, this.email);
    }

    public String get_nome() {
        return this.nome;
    }

    public String get_telefone() {
        return this.telefone;
    }

    public String get_email() {
        return this.email;
    }
}
