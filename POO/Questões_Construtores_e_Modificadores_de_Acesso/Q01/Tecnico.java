package Questões_Construtores_e_Modificadores_de_Acesso.Q01;

public class Tecnico {
    private String nome_tecnico;
    private int anos_experiencia;

    public void set_tecnico(String nome, int anos_e){
        this.nome_tecnico = nome;
        this.anos_experiencia = anos_e;
    }

    public String get_nome_tecnico() {
        return this.nome_tecnico;
    }

    public int get_anos_experiencia() {
        return this.anos_experiencia;
    }
}
