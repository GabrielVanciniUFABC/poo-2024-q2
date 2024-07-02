public class EstruturasRepeticao {
    public static void main(String[] args) {
        int i = 0;

        // while
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // do-while
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 5);
        System.out.println();

        // for
        for (int j = 0; j < 5; j++) {
            System.out.print((i + j) + " ");
        }
        System.out.println();
    }
}
