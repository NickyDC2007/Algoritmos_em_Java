package Lista_Heranca.Q01;

public class Gerente extends Funcionario {
    private int projetos_gerenciados;

    public Gerente(String n, int i, double s, int p) {
        super(n, i, s);
        super.set_cargo(new Cargo("Gerente"));
        this.projetos_gerenciados = p;
    }

    public double calcular_bonus_anual() {
        return super.get_salario() * 12 * 0.15 + this.projetos_gerenciados * 1000;
    }
}
