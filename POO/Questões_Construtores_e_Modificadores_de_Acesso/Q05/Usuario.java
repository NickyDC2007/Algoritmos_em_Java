package Questões_Construtores_e_Modificadores_de_Acesso.Q05;

public class Usuario {
    private String nome;
    private String email;
    private int idade;

    public void set_usuario(String n, String e, int i) {
        this.nome = n;
        this.email = e;
        this.idade = i;
    }

    public boolean email_valido(String e) {
        if (e.contains("@") && e.contains(".")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean idade_valida(int i) {
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String set_nome() {
        return this.nome;
    }

    public String set_email() {
        return this.email;
    }

    public int set_idade() {
        return this.idade;
    }
}
