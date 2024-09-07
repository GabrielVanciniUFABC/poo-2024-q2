package main;

public class Triangulo extends Poligono {

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[]{p1, p2, p3});
    }

    @Override
    public double largura() {
        SegmentoReta s1 = new SegmentoReta(getPontos()[1],getPontos()[2]);
        return s1.comprimento();
    }

    @Override
    public double altura() {
        SegmentoReta s1 = new SegmentoReta(getPontos()[2],getPontos()[0]);
        double comprimento = s1.comprimento();
        double angle = s1.coeficienteAngular();

        return comprimento*Math.sin(angle);
    }

    @Override
    public double area() {
        double altura = altura();
        double largura = largura();
        double resultado = (altura*largura)/2;
        
        return resultado;
    }

    public Ponto getP1(){
        return getPontos()[0];
    }
    public Ponto getP2(){
        return getPontos()[1];
    }
    public Ponto getP3(){
        return getPontos()[2];
    }

}
