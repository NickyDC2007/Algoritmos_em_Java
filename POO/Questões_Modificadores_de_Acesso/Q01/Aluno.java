package Questões_Modificadores_de_Acesso.Q01;

public class Aluno {
    public String nome;
    private String matricula;

    public Aluno(String n, String m) {
        this.nome = n;
        this.matricula = m;
    }

    public void set_matricula(String m) {
        this.matricula = m;
    }

    public String get_matricula() {
        return matricula;
    }
}
