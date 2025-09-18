package Questões_Classe_E_Objetos.Q03;

public class Conta_Bancaria {
    String titular;
    int numero;
    double saldo = 0;

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.printf("O valor depositado foi de: %.2f", valor);
    }

    public void sacar(double valor) {
        if (this.saldo - valor >= 0) {
            this.saldo = this.saldo - valor;
            System.out.printf("O valor sacado foi de: %.2f", valor);
        }
        else {
            System.out.print("Valor maior que o saldo atual. Tente novamente.");
        }
    }

    public void exibir_saldo() {
        System.out.printf("O saldo atual da conta é de: %.2f", this.saldo);
    }
}
