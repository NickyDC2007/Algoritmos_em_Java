package Lista_de_Treino.Q01;

public class Carro {
    String modelo;
    double consumo = 0, capacidade = 0, km_viagem = 0, preco_gas = 0,litros_viagem = 0, custo_viagem = 0;

    public void Trajetoria() {
        litros_viagem = km_viagem / consumo;
        custo_viagem = litros_viagem * preco_gas;
    }
}
