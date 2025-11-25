package br.com.alura.heranca;

public class PrincipalHeranca {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Roberto", 15000, "Marketing");
        gerente.exibirInformacoes();
        gerente.reajustarSalario(10);
        gerente.setBonus(1000);
        System.out.println("Bonus: " + gerente.getBonus());

        DesignerGrafico mariaDesignerGrafico = new DesignerGrafico("Maria", 4000, "Photoshop");
        mariaDesignerGrafico.exibirInformacoes();
        mariaDesignerGrafico.reajustarSalario(5);
        mariaDesignerGrafico.exibirInformacoes2();
    }
}
