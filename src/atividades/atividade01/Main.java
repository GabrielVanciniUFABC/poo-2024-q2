public class Main {
    public static double sqrt(double n, double epsilon) {
        double chuteInicial = n / 2;
        double chuteAnterior;
        double erro;
        double resposta;

        do {
            chuteAnterior = chuteInicial;
            erro = Math.abs(chuteAnterior * chuteAnterior - n);
            chuteInicial = (chuteAnterior + n / chuteAnterior) / 2;
        } while (erro > epsilon);

        resposta = chuteAnterior;

        return resposta;
    }

    public static boolean isPerfectNumber(long number) {
        if (number <= 1) {
            return false;
        }

        int somaDivisores = 1;
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                somaDivisores += divisor;
            }
        }

        return number == somaDivisores;
    }

    public static String encrypt(String message, int key) {
        StringBuilder textoCifrado = new StringBuilder();

        for (char letra : message.toCharArray()) {
            char letraCifrada;
            letraCifrada = (char) ((letra + key - 'a') % 26 + 'a');
            textoCifrado.append(letraCifrada);
        }
        return textoCifrado.toString();
    }

    public static String decrypt(String encryptedMessage, int key) {
        StringBuilder textoOriginal = new StringBuilder();

        for (char letra : encryptedMessage.toCharArray()) {
                char letraDecifrada;
                letraDecifrada = (char) ((letra - key - 'a' + 26) % 26 + 'a');
                textoOriginal.append(letraDecifrada);
        }

        return textoOriginal.toString();
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println(sqrt(16, 0.0001));
        //System.out.println(isPerfectNumber(6));
        //System.out.println(encrypt("hello", 3));
        //System.out.println(decrypt("khoor", 3));
    }
}
