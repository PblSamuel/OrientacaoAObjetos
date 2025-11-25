package br.com.alura.encapsulamento;

//Os atributos da classe funcionário são protegidos com private para que não possam ser modificados por outras classes com facilidade, 
// isso é importante para evitar problemas em sistemas
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private int controleReajuste;

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salario: " + getSalario());
    }

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void exibirInformacoes2() {
        System.out.printf("Funcionario %s - Cargo: %s - Salario: %.2f\n", getNome(), getCargo(), getSalario());
    }

    public void reajustarSalario(double percentual) {
        if (controleReajuste >= 1) {

            controleReajuste++;
            salario += salario * percentual / 100;
            System.out.printf("Salario reajustado, valor de %s e %.2f reais \n", getNome(), getSalario());
        } else {
            System.out.println("Sálario não pode ser reajustado");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
