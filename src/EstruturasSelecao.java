public class EstruturasSelecao {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // simples
        if (a != b) {
            System.out.println("a é diferente de b");
        }

        // composta
        if (a == b) {
            System.out.println("a é igual a b");
        } else {
            System.out.println("a é diferente de b");
        }

        // encadeada
        if (a > b) {
            System.out.println("a é maior que b");
        } else if (a < b) {
            System.out.println("a é menor que b");
        } else {
            System.out.println("a é igual a b");
        }
    }
}
