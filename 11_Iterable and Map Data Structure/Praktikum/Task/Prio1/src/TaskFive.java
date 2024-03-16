public class TaskFive {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int nextNonDuplicate = 1; // Indeks untuk menunjukkan angka unik berikutnya

        // Melakukan iterasi melalui array
        for (int i = 1; i < nums.length; i++) {
            // Jika angka saat ini berbeda dengan angka sebelumnya, masukkan ke dalam subarray tanpa duplikat
            if (nums[i] != nums[nextNonDuplicate - 1]) {
                nums[nextNonDuplicate] = nums[i];
                nextNonDuplicate++;
            }
        }

        return nextNonDuplicate;
    }

    public static void main(String[] args) {
        // Test Cases
        int[] nums1 = {2, 3, 3, 3, 6, 9, 9};
        System.out.println("Output 1: " + removeDuplicates(nums1));  // Output: 4

        int[] nums2 = {2, 2, 2, 11};
        System.out.println("Output 2: " + removeDuplicates(nums2));  // Output: 2
    }
}
