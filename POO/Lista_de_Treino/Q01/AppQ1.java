package Lista_de_Treino.Q01;

import java.util.Scanner;

/*  
 * O programa lê as informações de um carro:
 *  - modelo
 *  - consumo (km/l)
 *  - capacidade do tanque
 *  - distância do trajeto
 *  - preço da gasolina
 *
 * A partir desses dados, calcula:
 *  - quantos litros serão gastos no trajeto
 *  - o custo total da viagem
 *
 * Também informa se o trajeto pode ser feito sem precisar abastecer.
 */

public class AppQ1 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        Carro carros = new Carro();

        System.out.print("Insira o modelo do carro: ");
        carros.modelo = input.nextLine();

        System.out.printf("\nInsira o consumo do carro(km/l): ");
        carros.consumo = input.nextDouble();

        System.out.printf("Insira a capacidade do tanque do carro: ");
        carros.capacidade = input.nextDouble();

        System.out.printf("\nInsira o trajeto em quilômetros: ");
        carros.km_viagem = input.nextDouble();

        System.out.printf("Insira o preço da gasolina por litro: ");
        carros.preco_gas = input.nextDouble();

        carros.Trajetoria();
        
        System.out.printf("\n --- Trajeto ---\n");
        System.out.printf("\nOs litros gastos no trajeto foram de %.1f", carros.litros_viagem);
        System.out.printf("\nO custo total do trajeto foi de %.1f", carros.custo_viagem);
        if (carros.litros_viagem > carros.capacidade) {
            System.out.printf("\nO trajeto não pode ser realizado sem abastecer");
        } else {
            System.out.printf("\nO trajeto pode ser realizado sem abastecer\n");
        }

        input.close();
    }
}
