import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class TaskFour {
    public static int[] arrayUnique(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        // Memasukkan semua angka dari array kedua ke dalam set
        for (int num : arr2) {
            set.add(num);
        }

        // Memeriksa setiap angka dalam array pertama
        // Jika angka tersebut tidak ada dalam set (array kedua), maka dimasukkan ke dalam list hasil
        for (int num : arr1) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }

        // Mengonversi list hasil menjadi array
        int[] uniqueArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            uniqueArray[i] = result.get(i);
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        // Test Cases
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 5, 10, 16};
        int[] result1 = arrayUnique(arr1, arr2);
        System.out.print("Output 1: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] arr3 = {3, 8};
        int[] arr4 = {2, 8};
        int[] result2 = arrayUnique(arr3, arr4);
        System.out.print("Output 2: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
