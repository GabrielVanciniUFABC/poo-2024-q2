/**
 * Definição de um pacote
 */
package aula03.br.org.xyz.banco;

public class ContaCorrente {
    String numeroDaConta;
    String titular;
    float saldo;

    public ContaCorrente(final String numeroDaConta, final String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = 0.0f;
    }

    public float sacar(final float amount) {
        if (amount <= this.saldo) {
            this.saldo -= amount;
        }

        return this.saldo;
    }

    public float depositar(final float amount) {
        this.saldo += amount;

        return this.saldo;
    }

    public String getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return this.saldo;
    }
    
}