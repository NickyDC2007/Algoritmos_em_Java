package Questões_Construtores_e_Modificadores_de_Acesso.Q01;

import java.util.ArrayList;

public class Liga {
    ArrayList<Time> liga = new ArrayList<>();

    public void printar_times() {
        int i = 1;
        for (Time time : liga) {
            System.out.printf("[%d] %s", i, time.get_nome_time());
            System.out.print("\n");
            i++;
        }
    }

    public void verificar_times(int escolha) {
        int i = 1;
        for (Time time : liga) {
            if(i == escolha) {
                time.info_time();
            }
            i++;
        }
    }

    public void adicionar_time(Time t) {
        liga.add(t);
    }

    public int tamanho_liga() {
        return liga.size();
    }
}
