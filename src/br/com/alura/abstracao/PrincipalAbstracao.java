package br.com.alura.abstracao;

public class PrincipalAbstracao {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Pablo";
        funcionario1.cargo = "Vendedor";
        funcionario1.salario = 3000;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Maria";
        funcionario2.cargo = "Gerente";
        funcionario2.salario = 5000;

        funcionario1.exibirInformacoes();
        funcionario2.exibirInformacoes2();

        funcionario1.reajustarSalario(15);
        funcionario1.exibirInformacoes2();
    }
}
