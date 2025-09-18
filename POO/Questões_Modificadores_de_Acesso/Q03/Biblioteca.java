package Questões_Modificadores_de_Acesso.Q03;

import java.util.ArrayList;

public class Biblioteca {
    Livro[] livrosfixos = new Livro[3];
    ArrayList<Livro> livrosextras = new ArrayList<>();

    private int contador = 0;

    public void cadastrar_livro(Livro l) {
        if (contador < 3) {
            livrosfixos[contador] = l;
            contador++;
        } else {
            livrosextras.add(l);
        }
    }

    public void listar_livros() {
        for (int i = 0; i < 3; i++) {
            System.out.printf("Livros Fixos: [Autor: %s] %s", livrosfixos[i].get_autor(), livrosfixos[i].titulo);
            System.out.print("\n");
        }
        System.out.print("\n");
        for (Livro livro : livrosextras) {
            System.out.printf("Livros Extras: [Autor: %s] %s", livro.get_autor(), livro.titulo);
            System.out.print("\n");
        }
    }
}
