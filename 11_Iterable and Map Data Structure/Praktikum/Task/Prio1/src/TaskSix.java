public class TaskSix {
    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxSum = 0;
        int currentSum = 0;

        // Menghitung jumlah awal untuk subarray pertama dengan ukuran k
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;

        // Menelusuri array untuk menghitung jumlah subarray berikutnya dengan ukuran k
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k]; // Menambahkan elemen baru dan mengurangi elemen terakhir
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Test Cases
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        System.out.println("Output 1: " + findMaxSumSubarray(arr1, k1));  // Output: 9

        int[] arr2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        System.out.println("Output 2: " + findMaxSumSubarray(arr2, k2));  // Output: 7
    }
}
