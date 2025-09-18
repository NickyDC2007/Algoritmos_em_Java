package Questões_Modificadores_de_Acesso.Q03;

/*
    Programa que gerencia uma biblioteca de livros.
    O título é público (acesso direto) e o autor é privado (usa get/set).
    A biblioteca permite cadastrar livros e listar os títulos e autores.
*/

public class AppQ3 {
    public static void main() {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.cadastrar_livro(new Livro("Harry Potter", "J.K Rowling"));
        biblioteca.cadastrar_livro(new Livro("Moomins", "Tove Jansson"));
        biblioteca.cadastrar_livro(new Livro("Sherlock Holmes", "Arthur Conan Doyle"));
        biblioteca.cadastrar_livro(new Livro("Os Miseraveis", "Victor Hugo"));

        biblioteca.listar_livros();
    }
}
