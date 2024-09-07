import main.Paralelogramo;
import main.Ponto;
import main.SegmentoReta;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0.429614, 0.325974);
        Ponto p2 = new Ponto(0.559364, 0.325974);
        Ponto p3 = new Ponto(0.995667, 0.152841);
        Ponto p4 = new Ponto(0.865917, 0.152841);

        SegmentoReta s1 = new SegmentoReta(p1,p2);
        SegmentoReta s2 = new SegmentoReta(p2,p3);
        SegmentoReta s3 = new SegmentoReta(p3,p4);
        SegmentoReta s4 = new SegmentoReta(p4,p1);

        Paralelogramo pa1 = new Paralelogramo(p1,p2,p3,p4);

        System.out.println(s1.comprimento());
        System.out.println(s3.comprimento());
        System.out.println(s3.coeficienteAngular());
        System.out.println(Math.cos(s3.coeficienteAngular()));
        System.out.println(s3.comprimento()*Math.cos(s3.coeficienteAngular()));

        System.out.println(s1.comprimento()+s2.comprimento()*Math.cos(s3.coeficienteAngular()));

        System.out.println(pa1.largura());

        //System.out.println(new Ponto(0.1, 0.2));
    }
}
