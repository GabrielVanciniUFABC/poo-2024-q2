public class PassagemArgumentoReferencia {
    public static void main(String[] args) {
        int v[] = {1, 2, 3, 4, 5};

        printArray(v);
        incrementa(v);
        printArray(v);
    }

    public static void incrementa(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i]++;
        }
    }

    public static void printArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
