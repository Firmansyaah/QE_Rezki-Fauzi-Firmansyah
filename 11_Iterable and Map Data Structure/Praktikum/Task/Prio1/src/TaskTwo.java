import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskTwo {
    public static List<Integer> findUniqueNumbers(String inputStr) {
        // Membuat map untuk menghitung frekuensi setiap angka
        Map<Character, Integer> frequency = new HashMap<>();
        for (char digit : inputStr.toCharArray()) {
            frequency.put(digit, frequency.getOrDefault(digit, 0) + 1);
        }

        // Menyaring angka yang hanya muncul satu kali
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (char digit : frequency.keySet()) {
            if (frequency.get(digit) == 1) {
                uniqueNumbers.add(Character.getNumericValue(digit));
            }
        }

        return uniqueNumbers;
    }

    public static void main(String[] args) {
        // Test Cases
        System.out.println(findUniqueNumbers("76523752"));  // Output: [6, 3]
        System.out.println(findUniqueNumbers("1122"));      // Output: []
    }
}
