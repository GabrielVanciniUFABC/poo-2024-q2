public class MetodosEstaticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int soma = soma(a, b);
        int subtracao = subtracao(a, b);

        System.out.printf("a + b = %d\n", soma);
        System.out.printf("a - b = %d\n", subtracao);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }
}
