public class EstruturasDesvio {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            if (i % 8 == 0) {
                return;
            }
            System.out.print(i + " ");
        }        
    }
}
