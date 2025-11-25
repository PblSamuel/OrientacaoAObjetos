package br.com.alura.heranca;

public class Funcionario {
    private String nome;
    private double salario;

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes2() {
        System.out.printf("Funcionario %s - Salario: %.2f\n", getNome(), getSalario());
    }

    public void reajustarSalario(double percentual) {
        salario += salario * percentual / 100;
        System.out.printf("Salario reajustado, valor de %s e %.2f reais \n", nome, salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

}
