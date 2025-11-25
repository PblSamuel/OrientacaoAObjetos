package br.com.alura.encapsulamento;

public class PrincipalEncapsulamento {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao", 3548.00, "Analista de Sistemas");
        funcionario1.exibirInformacoes();
        funcionario1.reajustarSalario(10);
        funcionario1.setCargo("Gerente Analista de Sistemas");
        funcionario1.exibirInformacoes();
        funcionario1.reajustarSalario(50);
        funcionario1.exibirInformacoes();
    }
}
