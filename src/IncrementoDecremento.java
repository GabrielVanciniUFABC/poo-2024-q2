public class IncrementoDecremento {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = ++a;
        int d = a--;
        int e = --a;

        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);
        System.out.printf("c = %d\n", c);
        System.out.printf("d = %d\n", d);
        System.out.printf("e = %d\n", e);
    }
}
