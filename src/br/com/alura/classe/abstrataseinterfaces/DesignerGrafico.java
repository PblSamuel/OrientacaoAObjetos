package br.com.alura.classe.abstrataseinterfaces;

public class DesignerGrafico extends Funcionario {
    private String especialidade;

    public DesignerGrafico(String nome, double salario, String especialidade) {
        super(nome, salario);
        this.especialidade = especialidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Gerente: %s - Especialidade: %s - Salario: %.2f\n", getNome(), especialidade,
                getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    // Este é uma das consequencias de usar abstração de um metodo, você tem que
    // implementá-las nas classes filhas.
    @Override
    public void CalculaPLR() {
        System.out.println("PLR do Designer:");

    }

}
