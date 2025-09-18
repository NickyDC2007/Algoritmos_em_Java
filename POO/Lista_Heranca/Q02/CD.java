package Lista_Heranca.Q02;

public class CD extends Produto {
    private int numeros_faixas;

    public CD(String n, double p, String c, int f) {
        super(n, p, n);
        this.numeros_faixas = f;
    }

    public int get_numero_faixas() {
        return this.numeros_faixas;
    }

    public void imprimir_detalhes() {
        System.out.printf("| Produto: %s | Preço: %.2f | Código de Barras: %s | Número de Faixas: %d |", super.get_nome(), super.get_preco(), super.get_codigo_barras(), this.numeros_faixas);
    }
}
