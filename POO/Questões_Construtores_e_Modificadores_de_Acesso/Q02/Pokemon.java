package Questões_Construtores_e_Modificadores_de_Acesso.Q02;

public class Pokemon {

    private String nome_p;

    private int vida_s;
    private int ataque_f;
    private int ataque_e;
    private int defesa_f;
    private int defesa_e;
    private int velocidade;

    private int vida_a;
    private int vida_m;
    

    public Pokemon(String nome, int vida_s, int af, int ae, int df, int de, int vel, int vida_a, int vida_m) {
        this.nome_p = nome;

        this.vida_s = vida_s;
        this.ataque_f = af;
        this.ataque_e = ae;
        this.defesa_f = df;
        this.defesa_e = de;
        this.velocidade = vel;

        this.vida_a = vida_a;
        this.vida_m = vida_m;
    }

    public void mudar_vida_a(int v_a) {
        this.vida_a = v_a;
    }

    public String nome_p() {
        return this.nome_p;
    }

    public int vida_a_p() {
        return this.vida_a;
    }

    public int vida_m_p() {
        return this.vida_m;
    }

    public int vida_s_p() {
        return this.vida_s;
    }

    public int ataque_f_p() {
        return this.ataque_f;
    }

    public int ataque_e_p() {
        return this.ataque_e;
    }

    public int defesa_f_p() {
        return this.defesa_f;
    }

    public int defesa_e_p() {
        return this.defesa_e;
    }

    public int velocidade_p() {
        return this.velocidade;
    }

    public int soma_status() {
        return this.vida_s + this.ataque_f + this.ataque_e + this.defesa_f + this.defesa_e + this.velocidade;
    }

    public double media_status() {
        return soma_status() / 6;
    }

    public int curar_vida(int vida_atual, int vida_maxima) {
        if (vida_atual == vida_maxima) {
            return vida_atual;
        } else {
            return curar_vida(vida_atual + 1, vida_maxima);
        }
    }
}