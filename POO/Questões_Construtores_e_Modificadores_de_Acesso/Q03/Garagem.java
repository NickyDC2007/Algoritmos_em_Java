package Questões_Construtores_e_Modificadores_de_Acesso.Q03;

import java.util.ArrayList;

public class Garagem {
    ArrayList<Veiculos> Garagem = new ArrayList<>();

    public void adicionar_veiculo(Veiculos v) {
        Garagem.add(v);
    }

    public int size() {
        return Garagem.size();
    }

    public void listar_veiculos() {
        for (Veiculos veiculos : Garagem) {
            System.out.printf("[%s] %s %d - R$ %.2f", veiculos.get_tipo(), veiculos.get_marca(), veiculos.get_idade(), veiculos.get_valor());
            System.out.print("\n");
        }
    }

    public void selecionar_veiculo1() {
        int i = 1;
        for (Veiculos veiculos : Garagem) {
            System.out.printf("[%d] %s %d", i, veiculos.get_marca(), veiculos.get_idade());
            System.out.print("\n");
            i++;
        }
    }

    public void selecionar_veiculo2(int e) {
        int i = 1;
        for (Veiculos veiculos : Garagem) {
            if (i == e) {
                System.out.printf("O imposto individual do veículo %s %d foi de R$ %.2f", veiculos.get_marca(), veiculos.get_idade(), veiculos.calcular_imposto());
            }
            i++;
        }
    }

    public double imposto_total() {
        double soma = 0;
        for (Veiculos veiculos : Garagem) {
            soma = soma + veiculos.calcular_imposto();
        }
        return soma;
    }

    public double calcular_total(){
        return 0 ;
    }
}
