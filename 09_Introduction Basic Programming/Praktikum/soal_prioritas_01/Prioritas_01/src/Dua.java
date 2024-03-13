import java.util.Scanner;

public class Dua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang dan lebar
        System.out.print("Panjang: ");
        int panjang = scanner.nextInt();
        System.out.print("Lebar: ");
        int lebar = scanner.nextInt();

        // Menghitung luas
        int luas = panjang * lebar;

        // Menentukan apakah luasnya genap atau ganjil
        String hasil;
        if (luas % 2 == 0) {
            hasil = "even rectangle";
        } else {
            hasil = "odd rectangle";
        }

        // Menampilkan hasil
        System.out.println(hasil);
    }
}
