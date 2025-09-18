package Lista_Heranca.Q02;

public class Livro extends Produto {
    private String autor;

    public Livro(String n, double p, String c, String a) {
        super(n, p, c);
        this.autor = a;
    }

    public String get_autor() {
        return this.autor;
    }

    public void imprimir_detalhes() {
        System.out.printf("| Produto: %s | Preço: %.2f | Código de Barras: %s | Autor: %s |", super.get_nome(), super.get_preco(), super.get_codigo_barras(), this.autor);
    }
}
