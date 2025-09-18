package Questões_Modificadores_de_Acesso.Q04;

/*
    Programa que gerencia contas bancárias em um banco.
    O nome do titular pode ser acessado diretamente, mas o saldo é privado (usa get/set).
    É possível depositar, sacar e cadastrar contas no banco, além de exibir os saldos.
*/

public class AppQ4 {
    public static void main() {
        Banco banco = new Banco();

        Conta_Bancaria C1 = new Conta_Bancaria("Rodrigo", 0);
        Conta_Bancaria C2 = new Conta_Bancaria("Ana", 456);
        Conta_Bancaria C3 = new Conta_Bancaria("Felipe", 12543);
        Conta_Bancaria C4 = new Conta_Bancaria("Júlia", 2144);
        Conta_Bancaria C5 = new Conta_Bancaria("Wesley", 800);

        C1.depositar_saldo(4000);
        C2.depositar_saldo(44);
        C3.sacar_saldo(543);
        C4.sacar_saldo(144);
        C5.sacar_saldo(1000);

        banco.cadastrar_conta(C1);
        banco.cadastrar_conta(C2);
        banco.cadastrar_conta(C3);
        banco.cadastrar_conta(C4);
        banco.cadastrar_conta(C5);

        System.out.print("\n\n");

        banco.mostrar_saldo_contas();
    }
}
