package br.com.alura.heranca;

public class DesignerGrafico extends Funcionario {
    private String especialidade;

    public DesignerGrafico(String nome, double salario, String especialidade) {
        super(nome, salario);
        this.especialidade = especialidade;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Especialidade: " + especialidade);
    }

    public String getEspecialidade() {
        return especialidade;
    }

}
