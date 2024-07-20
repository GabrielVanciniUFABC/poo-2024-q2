
public class Racional {

    private int numerador;
    private int denominador;

    public Racional(int n, int d) {
        this.numerador = n;
        this.denominador = d;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public String converteParaString() {
        Racional referencia = new Racional(this.numerador, this.denominador);
        int mdc = calcularMDC(referencia.numerador, referencia.denominador);

        referencia.setNumerador(this.numerador / mdc);
        referencia.setDenominador(this.denominador / mdc);

        if (referencia.numerador < 0 || referencia.denominador < 0) {
            if (referencia.denominador < 0) {
                referencia.setDenominador(referencia.denominador * -1);
            }
            if (referencia.numerador < 0) {
                referencia.setNumerador(referencia.numerador * -1);
            }
            return String.format("-%d/%d", referencia.numerador, referencia.denominador);
        } else {
            return String.format("%d/%d", referencia.numerador, referencia.denominador);
        }
    }

    public Racional adiciona(Racional r) {
        int mmc = calcularMMC(this.denominador, r.denominador);
        int numerador1 = mmc / this.denominador * this.numerador;
        int numerador2 = mmc / r.denominador * r.numerador;
        int somaNumeradores = numerador1 + numerador2;

        Racional resultado = new Racional(somaNumeradores, mmc);
        return resultado;
    }

    public Racional subtrai(Racional r) {
        int mmc = calcularMMC(this.denominador, r.denominador);
        int numerador1 = mmc / this.denominador * this.numerador;
        int numerador2 = mmc / r.denominador * r.numerador;
        int subtracaoNumeradores = numerador1 - numerador2;

        Racional resultado = new Racional(subtracaoNumeradores, mmc);
        return resultado;
    }

    public Racional multiplica(Racional r) {
        int multNumerador = this.numerador * r.numerador;
        int multDenominador = this.denominador * r.denominador;

        Racional resultado = new Racional(multNumerador, multDenominador);
        return resultado;
    }

    public Racional divide(Racional r) {
        int divNumerador = this.numerador * r.denominador;
        int divDenominador = this.denominador * r.numerador;

        Racional resultado = new Racional(divNumerador, divDenominador);
        return resultado;
    }

    public boolean igual(Racional r) {
        return this.converteParaString().equals(r.converteParaString());
    }

    public int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int calcularMMC(int a, int b) {

        return calcularAbsoluto(a, b) / calcularMDC(a, b);
    }

    public int calcularAbsoluto(int a, int b) {
        int resultado = a * b;

        if (resultado >= 0) {
            return resultado;
        } else {
            return resultado * -1;
        }
    }

}
