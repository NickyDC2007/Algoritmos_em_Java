package Lista_Heranca.Q03;

public class Item_Biblioteca {
    private String titulo;
    private int ano_publicacao;
    private Tipo tipo;

    public Item_Biblioteca(String t, int a) {
        this.titulo = t;
        this.ano_publicacao = a;
        this.tipo = new Tipo("Produto Genérico");
    }

    public void set_tipo(Tipo t) {
        this.tipo = t;
    }

    public String get_titulo() {
        return this.titulo;
    }

    public int get_ano_publicacao() {
        return this.ano_publicacao;
    }

    public String get_tipo() {
        return tipo.get_tipo();
    }

    public void exibir_detalhes() {
        System.out.printf("| Titulo: %s | Ano de Publicação: %d | Tipo: %s |", this.titulo, this.ano_publicacao, get_tipo());
    }
}
