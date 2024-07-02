public class PromocaoTipos {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.0;
        double c = a + b; // promocao
        int d = a + (int) b; // casting

        System.out.printf("a + b = %.1f\n", c);
        System.out.printf("a + (int) b = %d\n", d);
    }
}
