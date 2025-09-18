package Questões_Modificadores_de_Acesso.Q03;

public class Livro {
    public String titulo;
    private String autor;

    public Livro(String t, String a) {
        this.titulo = t;
        this.autor = a;
    }

    public void set_autor(String autor) {
        this.autor = autor;
    }

    public String get_autor() {
        return autor;
    }
}
