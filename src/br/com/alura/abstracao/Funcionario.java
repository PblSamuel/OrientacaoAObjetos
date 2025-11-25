package br.com.alura.abstracao;

//Extraindo todos os atributos de uma classe
public class Funcionario {
    String nome;
    double salario;
    String cargo;

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }

    public void exibirInformacoes2() {
        System.out.printf("Funcionario %s - Cargo: %s - Salario: %.2f\n", nome, cargo, salario);
    }

    public void reajustarSalario(double percentual) {
        salario += salario * percentual / 100;
        System.out.printf("Salario reajustado, valor de %s e %.2f reais \n", nome, salario);
    }
}
