package sample;

public class Utils {
    public static int computeFactorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number");
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static String concatWords(String... words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static String normalizeWord(String word) {
        return java.text.Normalizer.normalize(word, java.text.Normalizer.Form.NFC);
    }
}
