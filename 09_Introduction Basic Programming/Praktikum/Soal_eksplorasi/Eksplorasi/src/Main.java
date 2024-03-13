import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kata
        System.out.print("Kata: ");
        String kata = scanner.nextLine();

        // Mengubah kata menjadi camel case
        String camelCase = toCamelCase(kata);

        // Menampilkan hasil
        System.out.println("Output: " + camelCase);
    }

    public static String toCamelCase(String kata) {
        String[] words = kata.split(" ");
        StringBuilder camelCaseBuilder = new StringBuilder(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            camelCaseBuilder.append(word.substring(0, 1).toUpperCase());
            camelCaseBuilder.append(word.substring(1).toLowerCase());
        }

        return camelCaseBuilder.toString();
    }
}