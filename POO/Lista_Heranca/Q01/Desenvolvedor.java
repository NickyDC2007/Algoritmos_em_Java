package Lista_Heranca.Q01;

public class Desenvolvedor extends Funcionario{
    private String linguagem_favorita;

    public Desenvolvedor(String n, int i, double s, String l) {
        super(n, i, s);
        super.set_cargo(new Cargo("Desenvolvedor"));
        this.linguagem_favorita = l;
    }

    public void imprimir_detalhes() {
        System.out.printf("| Nome: %s | Idade: %d | Salário: %.2f | Cargo: %s | Linguagem Favorita: %s |", super.get_nome(), super.get_idade(), super.get_salario(), super.get_cargo(), this.linguagem_favorita);
    }
}
