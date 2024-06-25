public class ExpressoesRelacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c = a == b;
        boolean d = a != b;
        boolean e = a > b;
        boolean f = a < b;
        boolean g = a >= b;
        boolean h = a <= b;

        System.out.printf("a == b = %b\n", c);
        System.out.printf("a != b = %b\n", d);
        System.out.printf("a > b = %b\n", e);
        System.out.printf("a < b = %b\n", f);
        System.out.printf("a >= b = %b\n", g);
        System.out.printf("a <= b = %b\n", h);
    }
}
