Projeto que irá abordar os cursos "Praticando Java" da Alura


Conhecendo os pilares da programação orientada a objetos
    A Programação Orientada a Objetos é baseada em quatro pilares:

        Abstração,
        Encapsulamento,
        Herança e
        Polimorfismo.

    Vantagens da Orientação a Objetos
        Baseado no que foi discutido, as vantagens que perceberemos ao longo do tempo utilizando orientação a objetos são:

            Organização do código;
            Reutilização;
            Facilidade de manutenção;
            Escalabilidade e
            Modularidade

            Abstração: 
                abstração é o conceito de focar no "o quê" um objeto faz, em vez de "como" ele faz.

            Encapsulamento: 
                O encapsulamento é um conceito fundamental que restringe o acesso direto aos atributos de uma classe, fornecendo métodos específicos para esse acesso.

            Herança: 
                Permite que uma classe filha aproveite atributos e metodos da classe pai. 

            Polimorfismo:
                O polimorfismo permite que o mesmo método tenha comportamentos diferentes dependendo de qual objeto o está chamando.
                No polimorfismo também é possível ter a sobrecarga, em que metodos com o mesmo nome possa ter assinaturas diferentes.


            Classes Abstratas e interfaces
                Uma classe abstrata é uma classe que não pode ser instanciada (você não pode criar um objeto diretamente dela), servindo apenas para ser herdada por outras classes.
                    Exemplo: A classe Animal pode obrigar que todos tenham o método emitirSom(), mas o Cachorro vai latir e o Gato vai miar.

                Uma interface ela é uma lista de obrigações. Ela define quais métodos uma classe deve ter, mas não contém nenhuma implementação de código (lógica) dentro dela.
                    Exemplo: Pense em uma porta USB.
                                A Interface é o formato padrão da entrada USB. Ela define as regras: "tem que ter essa largura, esses pinos e passar energia".
                                Ela não se importa com o que você vai conectar nela (um mouse, um teclado, um carregador).
                                Qualquer fabricante (Samsung, Apple, Dell) pode criar um dispositivo, contanto que ele respeite o contrato (o formato USB).
                Diferença da Classe Abstrata:
                    Classe Abstrata: Pode ter código pronto (metade feita) e métodos obrigatórios (por fazer). É um "pai" para a classe.
                    Interface: Não tem código pronto, apenas regras. É uma "habilidade" ou "certificado" que a classe adquire.

Strings e Regex
    Strings não são variáveis, elas são classes 
    Existem duas formas principais de modificar o conteúdo de uma String e aprimorar a exibição de textos: usando String.format() e printf().
        %s	    > Substitui uma string
        %d	    > Substitui um inteiro
        %f	    > Substitui um número em ponto flutuante (float/double)
        %n	    > Insere uma nova linha
        %.2f	> Formata o valor com duas casas decimais
    
    Metodos de manipulação
        .trim() - ele tira os espaços desnecessários de uma string.
        .toLowerCase() - ele deixa a string com caixa baixa.
        .toUpperCase() - ele deixa a string com caixa alta.
        .replace() - ele troca uma string por outra.
        .charAt() – Retorna o caractere de uma posição específica na string.
        .substring() – Permite extrair um trecho da string, podendo definir tanto a posição inicial quanto a final. Por exemplo, substring(0, 10).
        .contains() – Verifica se uma determinada palavra ou sequência de caracteres está presente na string.
        .startsWith() – Confere se a string começa com um determinado conjunto de caracteres. Por exemplo, professor.startsWith("Jac") retornará true se o nome começar com "Jac".
        .endsWith() – Similar ao startsWith, mas verifica se a string termina com um determinado sufixo.

Regex - Regex é a abreviação de expressões regulares
    Caracteres especiais:
        .	Caractere, exceto quebra de linha
        \d	Dígito (0-9)
        \D	Caractere que não é um dígito
        \w	Caractere alfanumérico
        \W	Caractere não alfanumérico
        \s	Espaço em branco
        \S	Caractere que não é espaço em branco
        ^	Início da string
        $	Fim da string
            
            Se precisarmos de dígitos de 0 a 9, ou qualquer caractere que não seja um dígito, usamos D maiúsculo. Para caracteres alfanuméricos, usamos w minúsculo. Se quisermos qualquer caractere que não seja alfanumérico, usamos W maiúsculo.

            Existem vários caracteres especiais que podemos utilizar, além de classes de caracteres, onde definimos caracteres específicos que poderíamos usar. Quando utilizamos colchetes em expressões regulares, qualquer caractere dentro deles, como A, B ou C, será considerado. Se utilizarmos o acento circunflexo ^, significa qualquer caractere, exceto os especificados. Existem várias combinações possíveis ao trabalhar com regex para criar o padrão desejado.
                Símbolo	Descrição
                [abc]	Qualquer caractere dentro dos colchetes ('a', 'b' ou 'c')
                [^abc]	Qualquer caractere exceto os que estejam dentro dos colchetes
                [a-z]	Qualquer caractere minúsculo de 'a' a 'z'
                [A-Z]	Qualquer caractere maiúsculo de 'A' a 'Z'
                [0-9]	Qualquer dígito
                [a-zA-Z]	Qualquer letra maiúscula ou minúscula

    Além disso, temos os quantificadores, que indicam, por exemplo, que deve haver zero ou mais ocorrências, ou pelo menos uma ou mais ocorrências. Por isso, utilizamos \w+, onde \w representa um caractere alfanumérico e o sinal de mais indica uma ou mais ocorrências. Podemos definir um número exato de ocorrências dentro dos colchetes ou especificar ocorrências opcionais, como N ou mais ocorrências. Há diversas combinações possíveis.
        Símbolo	Descrição
        *	    0 ou mais ocorrências do padrão anterior
        +	    1 ou mais ocorrências do padrão anterior
        ?	    0 ou 1 ocorrência do padrão anterior
        {n}	    Exatamente n ocorrências do padrão anterior
        {n,}	n ou mais ocorrências do padrão anterior
        {n,m}	Entre n e m ocorrências do padrão anterior
    
    Na classe Matcher, temos métodos como find, que verifica se ocorreu uma correspondência, e group, que agrupa e exibe as ocorrências. Outros métodos incluem matches, lookingAt e replaceAll, que encontram e substituem padrões.
        Método	    Descrição
        find	    Procura por um padrão em qualquer parte da string. Retorna o primeiro resultado encontrado.
        matches	    Verifica se a string inteira corresponde ao padrão.
        lookingAt	Verifica se a string parcialmente corresponde ao padrão.
        replaceAll	Substitui ocorrências do padrão por uma string.
    
    Este é um site para testar o regex: https://regex101.com/

coleções e streams
Coleções
    Os arrays são basicamente uma construção de baixo nível, em que ele tem uma inflexibilidade em alguns aspectos, por isso damos prioridade para o uso das coleções(Colections) do Java
        List, Set e Map.
            List:
                Permite ordenação e duplicidade
                Implementações: ArrayList e LinkedList
                    Usamos ArrayList quando queremos realizar buscas rápidas. 
                    Já o LinkedList é preferido quando fazemos muitas inserções e remoções.
                As operações mais comuns ao utilizar esse tipo de coleção são:
                    .add        para adicionar um elemento;
                    .remove     para remover;
                    .contains   para verificar se um elemento existe na lista;
                    .get        para obter um elemento em uma posição específica e
                    .size       para saber o tamanho total da lista. 
            Set:
                O Set é usado quando a ordenação não é o foco. Ele não permite duplicidade, então não poderíamos ter dois "João". 
                As implementações do Set incluem:
                    HashSet, LinkedHashSet e TreeSet.
                        O HashSet é o mais rápido, pois não se preocupa com ordenação e não permite duplicidade. O LinkedHashSet mantém a ordem de inserção, enquanto o TreeSet permite ordenação, mas é mais lento.
                    As operações mais comuns ao utilizar esse tipo de coleção são:
                    .add        para adicionar um elemento;
                    .remove     para remover;
                    .contains   para verificar se um elemento existe na lista;
                    .get        para obter um elemento em uma posição específica e
                    .size       para saber o tamanho total da lista. 
            Map:
                O objetivo é semelhante ao do Set. O HashMap é o mais rápido e não considera a ordem. 
                    O LinkedHashMap mantém a ordem de inserção, e o TreeMap é ordenado pela chave. 
                    No Map, o primeiro item é a chave e o segundo é o valor.
                Ele possui operações diferentes dos anteriores, como:
                    .Put;
                    .Get;
                    .Remove;
                    .ContainsKey e
                    .keySet.
Streams
    Streams permite realizar operações funcionais e processar essas coleções(colections) de forma funcional.
        Ao trabalhar com a API de Streams, geralmente desejamos utilizar métodos para realizar filtros, transformações e agregações sem modificar a coleção original. Sempre faremos isso em outra coleção, mantendo a coleção original inalterada.

        Teremos operações intermediárias que processam dados, gerando novos Streams, e operações terminais que encerram o fluxo, como uma impressão ou uma soma, finalizando a operação.

        As operações intermediárias mais comuns são:
            filter() e map().
                O filter é utilizado para filtrar, enquanto o map permite realizar transformações.

        As operações terminais mais comuns são:
            reduce() e collect().
                O reduce() é usado para reduzir e finalizar algum cálculo, e o collect() pode transformar os dados em outra lista.

    

