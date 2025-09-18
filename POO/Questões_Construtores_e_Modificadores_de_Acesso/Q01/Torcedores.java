package Questões_Construtores_e_Modificadores_de_Acesso.Q01;

public class Torcedores {
    private String nome_torcedor;
    private int jogos_assistidos;
    private boolean socio;
    private int q_pagamentos;

    public Torcedores(String nome, int jogos, boolean socio) {
        this.nome_torcedor = nome;
        this.jogos_assistidos = jogos;
        this.socio = socio;
    }

    public void set_q_pagamentos(int q_pagamentos) {
        this.q_pagamentos = q_pagamentos + this.q_pagamentos;
    }

    public String get_nome_torcedores() {
        return this.nome_torcedor;
    }

    public boolean get_socio() {
        return this.socio;
    }
    
    public int get_q_pagamentos() {
        return this.q_pagamentos;
    }

    public int get_jogos_assistidos() {
        return this.jogos_assistidos;
    }
}
