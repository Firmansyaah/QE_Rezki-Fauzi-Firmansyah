import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah angka dan nilai n
        System.out.print("Jumlah angka: ");
        int jumlahAngka = scanner.nextInt();
        System.out.print("Nilai n: ");
        int n = scanner.nextInt();

        // Menampilkan angka yang habis dibagi dengan n
        System.out.println("Angka yang habis dibagi dengan " + n + ":");
        for (int i = 1; i <= jumlahAngka; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
