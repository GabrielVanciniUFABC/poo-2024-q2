public class ExpressoesLogicas {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a && b;
        boolean d = a || b;
        boolean e = !a;

        System.out.printf("a && b = %b\n", c);
        System.out.printf("a || b = %b\n", d);
        System.out.printf("!a = %b\n", e);
    }
}
