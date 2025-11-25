package br.com.alura.colecoes_e_streams;

import java.util.*;
import java.util.stream.Collectors;

public class PrincipalStreams {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");
        // Aqui ele vai filtrar a lista para buscar pessoas com no nome que começa com a
        // letra "A" e depois inserir ela em na nova lista usando o Collect()
        List<String> funcionariosLetraA = funcionarios.stream().filter(f -> f.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(funcionarios);
        System.out.println(funcionariosLetraA);

        List<Double> valorVendas = List.of(500.0, 1800.0, 6200.0);

        List<Double> comissao = valorVendas.stream().map(v -> v * 0.05).collect(Collectors.toList());

        System.out.println(valorVendas);
        System.out.println(comissao);

        double totalVendas = valorVendas.stream().reduce(0.0, Double::sum);
        System.out.println("Total vendas: " + totalVendas);

    }

}
