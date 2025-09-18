package Questões_Modificadores_de_Acesso.Q04;

import java.util.ArrayList;

public class Banco {
    ArrayList<Conta_Bancaria> banco = new ArrayList<>();

    public void cadastrar_conta(Conta_Bancaria c) {
        banco.add(c);
    }

    public void mostrar_saldo_contas() {
        for (Conta_Bancaria conta_bancaria : banco) {
            System.out.printf("[Saldo: R$%.2f] Titular: %s", conta_bancaria.get_saldo(), conta_bancaria.titular);
            System.out.print("\n");
        }
    }
}
