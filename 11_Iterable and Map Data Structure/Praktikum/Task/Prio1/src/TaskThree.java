import java.util.HashMap;
import java.util.Map;
public class TaskThree {
    public static int[] findPair(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {-1, -1}; // Tidak ada pasangan yang ditemukan
    }

    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] result1 = findPair(nums1, target1);
        System.out.println("Output 1: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] result2 = findPair(nums2, target2);
        System.out.println("Output 2: [" + result2[0] + ", " + result2[1] + "]");
    }
}
