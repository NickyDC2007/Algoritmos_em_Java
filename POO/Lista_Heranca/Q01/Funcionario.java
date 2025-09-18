    package Lista_Heranca.Q01;

    public class Funcionario {
        private String nome;
        private int idade;
        private double salario;
        private Cargo cargo;

        public Funcionario(String n, int i, double s) {
            this.nome = n;
            this.idade = i;
            this.salario = s;
            this.cargo = new Cargo("Funcionario");
        }

        public void set_funcionario(String n, int i, double s) {
            this.nome = n;
            this.idade = i;
            this.salario = s;
        }

        public void set_cargo(Cargo c) {
            this.cargo = c;
        }

        public String get_nome() {
            return nome;
        }

        public int get_idade() {
            return idade;
        }

        public double get_salario() {
            return salario;
        }

        public String get_cargo() {
            return cargo.get_cargo();
        }

        public double calcular_bonus_anual() {
            return salario * 12 * 0.10;
        }

        public void imprimir_detalhes() {
            System.out.printf("| Nome: %s | Idade: %d | Salário: %.2f | Cargo: %s |", this.nome, this.idade, this.salario, this.get_cargo());
        }
    }