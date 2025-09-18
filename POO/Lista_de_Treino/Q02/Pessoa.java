package Lista_de_Treino.Q02;

public class Pessoa {
    String nome;
    int ano_de_nas,ano_atual;

    public void Idade() {
        if ((ano_atual - ano_de_nas) >= 18) {
            System.out.print("\nO usuário é maior de idade");
        } else {
            System.out.print("\nO usuário é menor de idade");
        }
    }
}
