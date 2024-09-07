package main;

public class Paralelogramo extends Trapezio {

    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double largura() {
        SegmentoReta s1 = new SegmentoReta(getP1(), getP2());
        SegmentoReta s2 = new SegmentoReta(getP3(), getP4());

        return s1.comprimento() + s2.comprimento() * Math.cos(s2.coeficienteAngular());
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta s1 = new SegmentoReta(p1, p2);
        SegmentoReta s2 = new SegmentoReta(p2, p3);
        SegmentoReta s3 = new SegmentoReta(p3, p4);
        SegmentoReta s4 = new SegmentoReta(p4, p1);

        boolean parallelPairs = (s1.paralelo(s3) && s2.paralelo(s4));
        boolean congruentPairs = (s1.comparar(s3) && s2.comparar(s4));

        return parallelPairs && congruentPairs;
    }
}
