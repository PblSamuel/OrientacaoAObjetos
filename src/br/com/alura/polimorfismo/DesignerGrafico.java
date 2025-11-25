package br.com.alura.polimorfismo;

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

}
