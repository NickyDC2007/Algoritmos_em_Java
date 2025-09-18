package Lista_de_Treino.Q03;

public class Funcionario {
    String nome;
    Double sal_bruto, sal_liquido, desconto;    

    public void Calcular() {
        sal_liquido = sal_bruto - desconto;
    }
}
