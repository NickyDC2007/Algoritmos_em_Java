package Questões_Construtores_e_Modificadores_de_Acesso.Q04;

public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private String curso;

    public void get_aluno(String nome, String matricula, int idade, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.curso = curso;
    }

    public String set_alunonome() {
        return this.nome;
    }
 
    public String set_alunomatricula() {
        return this.matricula;
    }

    public int set_alunoidade() {
        return this.idade;
    }
 
    public String set_alunocurso() {
        return this.curso;
    }
}
