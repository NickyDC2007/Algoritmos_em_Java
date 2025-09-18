package Lista_Heranca.Q03;

public class Revista extends Item_Biblioteca{
    private int edicao;
    private int periodicidade;

    public Revista(String t, int a, int e, int p) {
        super(t, a);
        super.set_tipo(new Tipo("Revista"));
        this.edicao = e;
        this.periodicidade = p;
    }

    public void exibir_detalhes() {
        System.out.printf("| Titulo: %s | Ano de Publicação: %d | Tipo: %s | Edição: %d° | Periodicidade: %d vezes por mês |", super.get_titulo(), super.get_ano_publicacao(), super.get_tipo(), this.edicao, this.periodicidade);
    }
}
