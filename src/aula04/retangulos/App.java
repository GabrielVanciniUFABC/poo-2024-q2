package aula04.retangulos;

public class App {
    public static void main(String[] args) {
        Retangulo a = new Retangulo(0, 0, 10, 10);
        Retangulo b = new Retangulo(5, 5, 10, 10);
        Retangulo c = new Retangulo(1, 1, 5, 5);
        Retangulo d = new Retangulo(11, 11, 5, 5);

        System.out.println("Area de a: " + a.area());
        System.out.println("Perimetro de a: " + a.perimetro());
        System.out.println("Area de b: " + b.area());
        System.out.println("Perimetro de b: " + b.perimetro());
        System.out.println("a interseciona b: " + a.interseciona(b));
        System.out.println("a contem b: " + a.contem(b));
        System.out.println("a interseciona c: " + a.interseciona(c));
        System.out.println("a contem c: " + a.contem(c));
        System.out.println("a interseciona d: " + a.interseciona(d));
        System.out.println("a contem d: " + a.contem(d));

    }
}