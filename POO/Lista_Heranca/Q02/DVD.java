package Lista_Heranca.Q02;

public class DVD extends Produto {
    private double duracao;

    public DVD(String n, double p, String c, double d) {
        super(n, p, c);
        this.duracao = d;
    }

    public double get_duracao() {
        return this.duracao;
    }

    public void imprimir_detalhes() {
        System.out.printf("| Produto: %s | Preço: %.2f | Código de Barras: %s | Duração do DVD: %.1f Horas |", super.get_nome(), super.get_preco(), super.get_codigo_barras(), this.duracao);
    }
}
