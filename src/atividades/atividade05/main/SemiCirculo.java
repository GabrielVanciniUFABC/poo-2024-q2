package main;

public class SemiCirculo extends FormaGeometrica {

    private final Ponto centro;
    private final double raio;

    public SemiCirculo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    @Override
    public double largura() {
        return raio * 2;
    }

    @Override
    public double altura() {
        return raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2) / 2;
    }

    @Override
    public double perimetro() {
        return raio * (Math.PI + 2);
    }

    public double getRaio(){
        return raio;
    }

    public Ponto getCentro(){
        return centro;
    }
}
