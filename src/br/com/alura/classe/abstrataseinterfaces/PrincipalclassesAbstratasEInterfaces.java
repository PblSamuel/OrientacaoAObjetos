package br.com.alura.classe.abstrataseinterfaces;

public class PrincipalclassesAbstratasEInterfaces {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Gerente("Alice", 5000.0, "Vendas");
        Funcionario funcionario2 = new DesignerGrafico("Bob", 3000.0, "Web Design");

        ((Gerente) funcionario1).setBonus(1000.0);
        funcionario1.exibirInformacoes();
        funcionario1.reajustarSalario(2);
        funcionario1.CalculaPLR();
        ((Gerente) funcionario1).aprovarProjeto("CRM");

        System.out.println();

        funcionario2.exibirInformacoes();
        funcionario2.reajustarSalario();
        funcionario2.CalculaPLR();

    }

}
