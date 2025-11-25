package br.com.alura.strings_e_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrincipalRegex {
    public static void main(String[] args) {

        String texto = "Meu email é teste@gmail.com";
        /*
         * Aqui iremos colocar um padrão de identificação de texto usando o Pattern para
         * identificar um email
         */
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
        /*
         * Aqui iremos verificar o padrão usando um Matcher onde ele irá verificar se o
         * texto contem algum dos padrões estabelecidos.
         */
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println(formatarTelefone("21977887744"));
    }

    public static String formatarTelefone(String telefone) {
        // Aqui da para separar uma string por grupo, assim podendo trata-la
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if (matcher.matches()) {
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return "Número de telefone inválido!";
    }
}
