public class PassagemArgumentosValor {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = f(a, b);
        System.out.printf("c = %d\n", c);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static int f(int a, int b) {
        a++;
        b++;
        return a + b;
    }
}
