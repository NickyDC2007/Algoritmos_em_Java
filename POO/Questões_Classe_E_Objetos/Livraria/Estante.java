package Questões_Classe_E_Objetos.Livraria;

import java.util.ArrayList;
import java.util.Random;

public class Estante {
    public ArrayList<Livros> estantes = new ArrayList<>();
    Random randomico = new Random();

    public void adicionar_livros(Livros livros) {
        estantes.add(livros);
    }

    public void printar_livros() {
        for (Livros livros : estantes) {
            livros.printar_livro();
        }
    }

    public int verificar_id() {
        int id;
        boolean valido;

        do {
            id = randomico.nextInt(9999);
            valido = true;
            for (Livros livros : estantes) {
                if (livros.id == id) {
                    valido = false;
                }
            }
        } while(!valido);

        return id;
    }

    public void remover_livros(int id) {
        for (Livros livros : estantes) {
            if (livros.id == id) {
                System.out.print("Livro removido.");
                estantes.remove(livros);
            }
            else {
                System.out.print("ID não encontrado.");
            }
        }
    }
}
