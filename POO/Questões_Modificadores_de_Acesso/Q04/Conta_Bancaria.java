package Questões_Modificadores_de_Acesso.Q04;

public class Conta_Bancaria {
    public String titular;
    private double saldo = 0;

    public Conta_Bancaria(String t, double s) {
        this.titular = t;
        this.saldo = s;
    }

    public void depositar_saldo(double s) {
        saldo = saldo + s;
    }

    public void sacar_saldo(double s) {
        double salvo = saldo;

        saldo = saldo - s;

        if (saldo < 0) {
            saldo = salvo;
            System.out.printf("%s Saldo Insuficiente. Tente novamente!", titular);
        }
    }

    public double get_saldo() {
        return saldo;
    }
}
