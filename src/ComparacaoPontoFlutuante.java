public class ComparacaoPontoFlutuante {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        double erro = 1e-10;
        boolean d = (a + b == c);
        boolean e = Math.abs(a + b - c) < erro;

        System.out.printf("a + b == c : %b\n", d);
        System.out.printf("a + b == c : %b\n", e);
    }
}
