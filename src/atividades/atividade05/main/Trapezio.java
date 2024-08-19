package main;

public class Trapezio extends Quadrilatero {

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double largura() {
        return baseMaior().comprimento();
    }

    @Override
    public double area() {
        double c1 = baseMaior().comprimento();
        double c2 = baseMenor().comprimento();
        double h = altura();

        return ((c1 + c2) * h) / 2;
    }

    public SegmentoReta baseMenor() {
        SegmentoReta s1 = new SegmentoReta(getPontos()[0], getPontos()[1]);
        SegmentoReta s2 = new SegmentoReta(getPontos()[2], getPontos()[3]);

        if (s1.comparar(s2) || s1.comprimento() < s2.comprimento()) {
            return s1;
        } else {
            return s2;
        }
    }

    public SegmentoReta baseMaior() {
        SegmentoReta s1 = new SegmentoReta(getPontos()[0], getPontos()[1]);
        SegmentoReta s2 = new SegmentoReta(getPontos()[2], getPontos()[3]);

        if (s1.comparar(s2) || s1.comprimento() < s2.comprimento()) {
            return s2;
        } else {
            return s1;
        }
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta s1 = new SegmentoReta(p1, p2);
        SegmentoReta s2 = new SegmentoReta(p2, p3);
        SegmentoReta s3 = new SegmentoReta(p3, p4);
        SegmentoReta s4 = new SegmentoReta(p4, p1);
        
        boolean pair1 = (s1.paralelo(s3) && !s2.paralelo(s4));
        boolean pair2 = (!s1.paralelo(s3) && s2.paralelo(s4));

        return pair1 || pair2;

    }

}
