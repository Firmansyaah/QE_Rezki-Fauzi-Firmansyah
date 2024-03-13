import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input berat paket
        System.out.print("Berat paket (kg): ");
        double beratPaket = scanner.nextDouble();

        // Input jarak tempuh
        System.out.print("Jarak tempuh (km): ");
        double jarakTempuh = scanner.nextDouble();

        // Menghitung biaya berdasarkan berat paket
        double biayaBerat;
        if (beratPaket < 2) {
            biayaBerat = 10000;
        } else if (beratPaket <= 7) {
            biayaBerat = 15000;
        } else if (beratPaket <= 15) {
            biayaBerat = 25000;
        } else {
            biayaBerat = 40000;
        }

        // Menghitung biaya berdasarkan jarak tempuh
        double biayaJarak;
        if (jarakTempuh < 1) {
            biayaJarak = 2000;
        } else if (jarakTempuh <= 7) {
            biayaJarak = 5000;
        } else if (jarakTempuh <= 15) {
            biayaJarak = 10000;
        } else {
            biayaJarak = 20000;
        }

        // Menghitung total biaya
        double totalBiaya = biayaBerat + biayaJarak;

        // Menampilkan hasil
        System.out.println("Biaya: Rp " + (int) totalBiaya);
    }
}
