package br.com.alura.polimorfismo;

public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Gerente: %s - Departamento: %s - Salario: %.2f - bonus: %.2f\n", getNome(), departamento,
                getSalario(), bonus);
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
