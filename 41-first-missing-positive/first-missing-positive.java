class Solution {
    public static void swap(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int index = arr[i] - 1;
            if (arr[i] == i + 1 || arr[i] <= 0 || arr[i] > n || arr[i] == arr[index])
                i++;
            else {
                swap(arr, i, index);
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}