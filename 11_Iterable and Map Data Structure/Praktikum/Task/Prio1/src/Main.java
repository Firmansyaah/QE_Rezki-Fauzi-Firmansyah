import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static List<String> gabungArray(String[] arr1, String[] arr2) {
        // Menggabungkan kedua array
        List<String> gabungan = new ArrayList<>();
        for (String nama : arr1) {
            gabungan.add(nama);
        }
        for (String nama : arr2) {
            gabungan.add(nama);
        }

        // Membuat set untuk menyimpan nama unik
        Set<String> namaUnik = new HashSet<>();
        List<String> hasil = new ArrayList<>();

        // Menyaring nama yang belum pernah ditemukan sebelumnya
        for (String nama : gabungan) {
            if (!namaUnik.contains(nama)) {
                hasil.add(nama);
                namaUnik.add(nama);
            }
        }

        return hasil;
    }

    public static void main(String[] args) {

        String[] arr1 = {"kazuya", "jin", "lee"};
        String[] arr2 = {"kazuya", "feng"};
        System.out.println(gabungArray(arr1, arr2));

        String[] arr3 = {"lee", "jin"};
        String[] arr4 = {"kazuya", "panda"};
        System.out.println(gabungArray(arr3, arr4));
    }
}
