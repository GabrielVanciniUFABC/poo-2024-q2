import main.Ponto;
import main.Triangulo;

public class Main {
    public static void main(String[] args) {

        
        Ponto A = new Ponto(0.1,0.2);
        Ponto B = new Ponto(0.3,0.4);
        Ponto C = new Ponto(0.2,0.3);
        Ponto D = new Ponto(0.4,0.5);

        //SegmentoReta s1 = new SegmentoReta(A,B);
        //SegmentoReta s2 = new SegmentoReta(C,D);

        Triangulo t1 = new Triangulo(A,B,C);

        System.out.println(t1.perimetro());
        System.out.println(t1.altura());
    }
}
