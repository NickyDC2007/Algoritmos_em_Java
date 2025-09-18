package Questões_Classe_E_Objetos.Livraria;

public class Livros {
    String titulo;
    String autor;
    int estoque;
    double preço;
    int id;

    public void adicionar_livro(String t,String a,int e,double p, int id) {
        this.titulo = t;
        this.autor = a;
        this.estoque = e;
        this.preço = p;
        this.id = id;
    }

    public void printar_livro() {
        System.out.printf("\nTitulo: %s | Autor: %s | Estoque: %d | Preço: R$%.2f | ID: %d", this.titulo, this.autor, this.estoque, this.preço, this.id);
    }
}
