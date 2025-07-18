class Solution {
    public static void swap(int[] arr, int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    public int firstMissingPositive(int[] arr) {
        int n = arr.length, i = 0;
        while (i < n) {
            if (arr[i] <= 0 || arr[i] > n || arr[i] == i + 1 || arr[i] == arr[arr[i] - 1]) i++;
            else swap(arr, i, arr[i] - 1);
        }
        for (i = 0; i < n; i++) if (arr[i] != i + 1) return i + 1;
        return n + 1;
    }
}