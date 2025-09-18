package Lista_Tratamento_de_Excessao_e_Heranca.Q01;

import java.util.ArrayList;

public class Matrizes {
    ArrayList<Matriz> matrizes = new ArrayList<>();

    public void adicionar_matriz(Matriz m) {
        matrizes.add(m);
    }

    public void limpar_matrizes() {
        matrizes.removeAll(matrizes);
    }

    public void mostrar_matrizes() {
        int i = 1;
        for (Matriz matriz : matrizes) {
            System.out.printf("%d° Matriz", i);
            System.out.print("\n\n");
            matriz.mostrar_matriz();
            i++;
        }
    }

    public void somar_matrizes() {
        int[][] s_matriz = new int[4][4];

        for (Matriz matriz : matrizes) {
            for(int x = 0; x < 4; x++) {
                for(int y = 0; y < 4; y++) {
                    s_matriz[y][x] = s_matriz[y][x] + matriz.get_matriz()[y][x];
                }
            }
        }

        for(int x = 0; x < 4; x++) {
            for(int y = 0; y < 4; y++) {
                System.out.printf("%d  ", s_matriz[y][x]);
            }
            System.out.print("\n\n");
        }
    }

    public void subtrair_matrizes() {
        int[][] s_matriz = new int[4][4];
        boolean primeiro = true;

        for (Matriz matriz : matrizes) {
            if (primeiro == true) {
                for(int x = 0; x < 4; x++) {
                    for(int y = 0; y < 4; y++) {
                        s_matriz[y][x] = matriz.get_matriz()[y][x];
                    }
                }
            } else {
                for(int x = 0; x < 4; x++) {
                    for(int y = 0; y < 4; y++) {
                        s_matriz[y][x] = s_matriz[y][x] - matriz.get_matriz()[y][x];
                    }
                }
            }
            primeiro = false;
        }

        for(int x = 0; x < 4; x++) {
            for(int y = 0; y < 4; y++) {
                System.out.printf("%d  ", s_matriz[y][x]);
            }
            System.out.print("\n\n");
        }
    }

    public void multiplicar_matrizes() {
        int[][] s_matriz = new int[4][4];
        boolean primeiro = true;

        for (Matriz matriz : matrizes) {
            if (primeiro == true) {
                for(int x = 0; x < 4; x++) {
                    for(int y = 0; y < 4; y++) {
                        s_matriz[y][x] = matriz.get_matriz()[y][x];
                    }
                }
            } else {
                for(int x = 0; x < 4; x++) {
                    for(int y = 0; y < 4; y++) {
                        s_matriz[y][x] = s_matriz[y][x] * matriz.get_matriz()[y][x];
                    }
                }
            }
            primeiro = false;
        }

        for(int x = 0; x < 4; x++) {
            for(int y = 0; y < 4; y++) {
                System.out.printf("%d  ", s_matriz[y][x]);
            }
            System.out.print("\n\n");
        }
    }

    public void matrizes_transpostas() {
        int i = 1;
        for (Matriz matriz : matrizes) {
            System.out.printf("%d° Matriz", i);
            System.out.print("\n\n");
            matriz.transpostar_matriz();
            i++;
        }
    }

    
}
