package br.com.alura.colecoes_e_streams;

import java.util.*;

public class PricipalColecoes {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Pedro");
        funcionarios.add("Amanda");
        funcionarios.add("Vanessa");
        System.out.println(funcionarios);

        Set<String> produtos = new HashSet<>();
        produtos.add("Agua");
        produtos.add("Coca-cola");
        produtos.add("Agua");
        System.out.println(produtos);

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Roberto");
        clientes.put(2, "Ana");
        clientes.put(3, "Dagoberto");

        System.out.println(clientes);

    }
}
