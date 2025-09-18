package Lista_Heranca.Q01;

/*
    Programa de cadastro e listagem de funcionários de uma empresa.

    Estrutura:
    - Empresa: gerencia listas de Funcionarios, Gerentes e Desenvolvedores.
    - Funcionario: super classe com nome, idade e salário.
    - Gerente: herda de Funcionario, adicionando o número de equipes gerenciadas.
    - Desenvolvedor: herda de Funcionario, adicionando a linguagem de programação.
    - Cargo: uma classe para guardar o cargo de cada funcionario.

    Funcionamento:
    - Cria uma instância de Empresa.
    - Adiciona vários Funcionarios, Gerentes e Desenvolvedores.
    - Lista todos os funcionários cadastrados.
    - Exibe o nome, idade , salário e bônus de cada funcionário.
*/

public class AppQ1 {
    public static void main(String[] args) {
        Empresa equipe = new Empresa();

        equipe.adcionar_funcionario(new Funcionario("Ana", 24, 2544.42));
        equipe.adcionar_funcionario(new Funcionario("Carlos", 29,3172.51));
        equipe.adcionar_funcionario(new Funcionario("Antonio", 22, 2134.27));
        equipe.adcionar_funcionario(new Funcionario("Luca", 31, 3434.67));

        equipe.adcionar_gerente(new Gerente("José", 36, 6542.58, 3));
        equipe.adcionar_gerente(new Gerente("Maria", 40, 7240.00, 2));

        equipe.adcionar_desenvolvedor(new Desenvolvedor("Isaac", 45, 10000.00, "Java"));
        equipe.adcionar_desenvolvedor(new Desenvolvedor("Casseb", 53, 12423.25, "C++"));
        equipe.adcionar_desenvolvedor(new Desenvolvedor("Suzana", 31, 5405.12, "Javascript"));

        equipe.listar_funcionarios();
        System.out.print("\n");
        equipe.bonus_funcionarios();
    }
}
