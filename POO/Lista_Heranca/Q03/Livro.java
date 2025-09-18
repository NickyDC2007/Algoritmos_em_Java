package Lista_Heranca.Q03;

public class Livro extends Item_Biblioteca{
    private String autor;
    private String genero;

    public Livro(String t, int a, String u, String g) {
        super(t, a);
        super.set_tipo(new Tipo("Livro"));
        this.autor = u;
        this.genero = g;
    }

    public void exibir_detalhes() {
        System.out.printf("| Titulo: %s | Ano de Publicação: %d | Tipo: %s | Autor: %s | Genero: %s |", super.get_titulo(), super.get_ano_publicacao(), super.get_tipo(), this.autor, this.genero);
    }
}
