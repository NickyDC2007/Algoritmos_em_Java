package Lista_Heranca.Q01;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Funcionario> Equipe = new ArrayList<>();

    public void adcionar_funcionario(Funcionario f) {
        Equipe.add(f);
    }

    public void adcionar_gerente(Gerente g) {
        Equipe.add(g);
    }

    public void adcionar_desenvolvedor(Desenvolvedor d) {
        Equipe.add(d);
    }

    public void listar_funcionarios() {
        for (Funcionario f : Equipe) {
            if (f instanceof Desenvolvedor) {
                ((Desenvolvedor) f).imprimir_detalhes();
                System.out.print("\n");
            } else {
                f.imprimir_detalhes();
                System.out.print("\n");
            }
        }
    }

    public void bonus_funcionarios() {
        for (Funcionario f : Equipe) {
            if (f instanceof Gerente) {
                System.out.printf("[Bônus: %.2f] %s", ((Gerente) f).calcular_bonus_anual(), f.get_nome());
                System.out.print("\n");
            } else {
                System.out.printf("[Bônus: %.2f] %s", f.calcular_bonus_anual(), f.get_nome());
                System.out.print("\n");
            }
        }
    }
}
