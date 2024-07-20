/**
 * Nomes de pacotes: cada componente com todas as letras
 * maiúsculas
 */
package br.edu.ufabc.naming;

/**
 * Idioma: preferencialmente em inglês, para todos os elementos
 *
 */

/**
 * Nomes das classes: inicia com letra maiúscula. Se houver mais de uma palavar,
 * concatenar usando CamelCase
 */
public class NamingConventions {

    /**
     * Nomes de variáveis: começa com minúscula, em CamelCase
     */
    String iAmAString;

    /**
     * Nomes de constantes: todas letras maiúsculas, palavras concatenadas com
     * sublinhado
     */
    final int SOME_CONSTANT = 10;

    /**
     * Nomes dos métodos: iniciando em minúscula, em CamelCase
     */
    public void methodThatDoesSomething(int someValue) {
        /**
         * *
         * Regras para blocos: - o bloco começa na mesma linha da declaração - a
         * quebra ocorre após a abertura do bloco - blocos com zero ou mais
         * comandos devem ser delimitados
         */
        if (true) {
            System.out.println();
        }

        /**
         * Limites de colunas: entre 80 e 100, no máximo Regras para quebra de
         * coluna - se for uma expressão, quebrar antes do operador
         */
        if (true
                && !false
                && true
                && !false) {

        }

        /**
         * Para mais regras, consulte o guia de estilo adequado.
         */
    }

    public String getiAmAString() {
        return iAmAString;
    }

    public void setiAmAString(String iAmAString) {
        this.iAmAString = iAmAString;
    }

    public int getSOME_CONSTANT() {
        return SOME_CONSTANT;
    }

}
