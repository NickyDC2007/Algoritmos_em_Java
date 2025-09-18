package Questões_Construtores_e_Modificadores_de_Acesso.Q03;

public class Veiculos {
    protected double imposto;

    protected String marca;
    protected int ano;
    protected double valor;

    protected String tipo;


    public void set_veiculo(String m, int a, double v) {
        this.marca = m;
        this.ano = a;
        this.valor = v;
    }

    public String get_marca() {
        return this.marca;
    }

    public double get_valor() {
        return this.valor;
    }

    public int get_idade() {
        return this.ano;
    }

    public String get_tipo() {
        return this.tipo;
    }

    public double calcular_imposto() {
        if (this.ano >= 15) {
            return 0;
        } else {
            return this.imposto * this.valor;
        }
    }

    public double valor_imposto() {
        return calcular_imposto() + this.valor;
    }



}


