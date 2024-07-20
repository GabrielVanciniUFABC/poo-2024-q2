package aula03.banco;

import aula03.br.org.xyz.banco.ContaCorrente;

public class Main {
    public static void printContaCorrente(ContaCorrente c) {
        System.out.printf("Numero: %s\n", c.getNumeroDaConta());
        System.out.printf("Titular: %s\n", c.getTitular());
        System.out.printf("Saldo: R$ %.2f\n", c.getSaldo());
    }

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("123-x", "Maria");
        ContaCorrente c2 = new ContaCorrente("456-x", "Joao");
        ContaCorrente c3 = c1;
        ContaCorrente c4 = null;

        printContaCorrente(c4);

        if (c4 != null) {
            c4.depositar(100);
        }        

        printContaCorrente(c1);        
        System.out.println();
        printContaCorrente(c2);
        System.out.println();
        printContaCorrente(c3);

        c1.depositar(100);
        c2.depositar(50);

        System.out.println();
        printContaCorrente(c1);
        System.out.println();
        printContaCorrente(c2);

        c1.sacar(100);
        c2.sacar(15);

        System.out.println();
        printContaCorrente(c1);
        System.out.println();
        printContaCorrente(c2);
    }
}