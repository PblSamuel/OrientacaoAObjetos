package br.com.alura.heranca;

//Gerente herda os atributos de funcionário
public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Departamento: " + departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
