package Lista_Heranca.Q02;

public class Loja {
    Produto[] estoque = new Produto[5];
    private int contador = 0;

    public void adicionar_livros(Livro l) {
        if (contador < 5) {
            estoque[contador] = l;
            contador++;
        } else {
            System.out.print("Sistema lotado. Tente novamente mais tarde!");
            System.out.print("\n");
        }
    }

    public void adicionar_CD(CD c) {
        if (contador < 5) {
            estoque[contador] = c;
            contador++;
        } else {
            System.out.print("Sistema lotado. Tente novamente mais tarde!");
            System.out.print("\n");
        }
    }

    public void adicionar_DVD(DVD d) {
        if (contador < 5) {
            estoque[contador] = d;
            contador++;
        } else {
            System.out.print("Sistema lotado. Tente novamente mais tarde!");
            System.out.print("\n");
        }
    }

    public void listar_produtos() {
        for (int i = 0; i < contador; i++) {
            if (estoque[i] instanceof Livro) {
                ((Livro) estoque[i]).imprimir_detalhes();
                System.out.print("\n");
            } else if (estoque[i] instanceof CD) {
                ((CD) estoque[i]).imprimir_detalhes();
                System.out.print("\n");
            } else {
                ((DVD) estoque[i]).imprimir_detalhes();
                System.out.print("\n");
            }
        }
    }

    public void procurar_produto(String codigo) {
        for(int i = 0; i < contador; i++) {
            if (estoque[i].get_codigo_barras().equals(codigo)) {
                System.out.printf(" ---- [Produto: %d] ----", i + 1);
                System.out.print("\n");

                if (estoque[i] instanceof Livro) {
                    ((Livro) estoque[i]).imprimir_detalhes();
                    System.out.print("\n");
                    if (i + 1 < estoque.length) {
                        estoque[contador] = new Livro(estoque[i].get_nome(), estoque[i].get_preco(), "99999", ((Livro) estoque[i]).get_autor());
                        contador++;
                    } else {
                        System.out.print("Sistema lotado. Tente novamente mais tarde!");
                        System.out.print("\n");
                    }
                } else if (estoque[i] instanceof CD) {
                    ((CD) estoque[i]).imprimir_detalhes();
                    System.out.print("\n");
                    if (i + 1 < estoque.length) {
                        estoque[contador] = new CD(estoque[i].get_nome(), estoque[i].get_preco(), "99999", ((CD) estoque[i]).get_numero_faixas());
                        contador++;
                    } else {
                        System.out.print("Sistema lotado. Tente novamente mais tarde!");
                        System.out.print("\n");
                    }
                } else {
                    ((DVD) estoque[i]).imprimir_detalhes();
                    System.out.print("\n");
                    if (i + 1 < estoque.length) {
                        estoque[contador] = new DVD(estoque[i].get_nome(), estoque[i].get_preco(), "99999", ((DVD) estoque[i]).get_duracao());
                        contador++;
                    } else {
                        System.out.print("Sistema lotado. Tente novamente mais tarde!");
                        System.out.print("\n");
                    }
                }

                return;
            } 
        }

        System.out.print("Produto não encontrado!");
        System.out.print("\n");
    }
}
