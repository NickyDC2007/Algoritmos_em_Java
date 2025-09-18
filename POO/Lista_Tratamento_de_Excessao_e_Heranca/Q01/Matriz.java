package Lista_Tratamento_de_Excessao_e_Heranca.Q01;

public class Matriz {
    private int[][] matriz = new int[4][4];

    public Matriz(int[][] m) {
        this.matriz = m;
    }

    public void mostrar_matriz() {
        for(int x = 0; x < 4; x++) {
            for(int y = 0; y < 4; y++) {
                System.out.printf("%d  ", matriz[y][x]);
            }
            System.out.print("\n\n");
        }
    }

    public int[][] get_matriz() {
        return matriz;
    }

    public void transpostar_matriz() {
        for(int x = 0; x < 4; x++) {
            for(int y = 0; y < 4; y++) {
                System.out.printf("%d  ", matriz[x][y]);
            }
            System.out.print("\n\n");
        }
    }
}
