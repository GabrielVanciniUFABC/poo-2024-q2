package main;

public class Elipse extends FormaGeometrica {

    private final Ponto centro;
    private final double semiEixoA;
    private final double semiEixoB;

    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        if (semiEixoA < 0 || semiEixoB < 0) {
            throw new IllegalArgumentException(String.format(
                    "axis must be positive: %f, %f", semiEixoA, semiEixoB));
        } else {
            this.centro = centro;
            this.semiEixoA = semiEixoA;
            this.semiEixoB = semiEixoB;
        }
    }

    @Override
    public double largura() {
        return getSemiEixoMaior() * 2;
    }

    @Override
    public double altura() {
        return getSemiEixoMenor() * 2;
    }

    @Override
    public double area() {
        return Math.PI * getSemiEixoMaior() * getSemiEixoMenor();
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * Math.sqrt((Math.pow(semiEixoA, 2) + Math.pow(semiEixoB, 2)) / 2);
    }

    public double getSemiEixoMenor() {
        if (semiEixoA > semiEixoB) {
            return semiEixoB;
        } else {
            return semiEixoA;
        }
    }

    public double getSemiEixoMaior() {
        if (semiEixoA < semiEixoB) {
            return semiEixoB;
        } else {
            return semiEixoA;
        }
    }

    public Ponto getCentro() {
        return centro;
    }

    public double circunferencia() {
        return perimetro();
    }

}
