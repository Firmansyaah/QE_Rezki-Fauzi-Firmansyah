import java.util.Scanner;

public class Dua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kata
        System.out.print("Kata: ");
        String kata = scanner.nextLine();

        // Mengganti huruf vokal menjadi angka
        kata = kata.replaceAll("a", "4");
        kata = kata.replaceAll("A", "4");
        kata = kata.replaceAll("e", "3");
        kata = kata.replaceAll("E", "3");
        kata = kata.replaceAll("i", "1");
        kata = kata.replaceAll("I", "1");
        kata = kata.replaceAll("o", "0");
        kata = kata.replaceAll("O", "0");

        // Menampilkan hasil
        System.out.println("Hasil: " + kata);
    }
}
