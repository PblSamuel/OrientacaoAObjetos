package br.com.alura.strings_e_regex;

public class PrincipalString {
    public static void main(String[] args) {
        String professor = "Jacqueline Oliveira";

        String disciplina = "Java e Programação Orientada a Objetos";

        // Isso é uma forma de deixar o texto formatado
        String curriculo = """

                Pós-graduada em Engenharia e
                Arquitetura de Software;
                Desenvolvedora backend Java desde 2010;
                 """;

        String texto = String.format("Disciplina: %s - %s", disciplina, professor);
        System.out.println(texto);

        System.out.printf("Nome: %s %nDisciplina: %s", professor, disciplina);

        System.out.println(curriculo);
    }
}
