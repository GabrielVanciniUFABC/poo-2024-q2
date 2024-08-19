package main;

public class Retangulo extends Quadrilatero {

    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double largura() {
        SegmentoReta s1 = new SegmentoReta(getPontos()[0], getPontos()[1]);

        return s1.comprimento();
    }

    public boolean quadrado() {
        if (existe(getPontos()[0], getPontos()[1], getPontos()[2], getPontos()[3])) {
            SegmentoReta s1 = new SegmentoReta(getPontos()[0], getPontos()[1]);
            SegmentoReta s2 = new SegmentoReta(getPontos()[1], getPontos()[2]);

            return s1.equals(s2);
        } else {
            return false;
        }
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta s1 = new SegmentoReta(p1, p2);
        SegmentoReta s2 = new SegmentoReta(p2, p3);
        SegmentoReta s3 = new SegmentoReta(p3, p4);
        SegmentoReta s4 = new SegmentoReta(p4, p1);

        boolean parallelPairs = (s1.paralelo(s3) && s2.paralelo(s4));
        boolean congruentPairs = (s1.comparar(s3) && s2.comparar(s4));

        if (parallelPairs && congruentPairs) {

            return (s1.coeficienteAngular() == 0 && s2.coeficienteAngular() == Double.POSITIVE_INFINITY);

        } else {

            return false;
        }

    }

}
