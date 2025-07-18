class Solution {
    public static void swap(int[] arr, int idx, int i) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }

    public int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        int i = 0;
        while (i < arr.length) {
            int idx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[i] == arr[idx]) {
                i++;
            } else {
                swap(arr, idx, i);
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans[0] = arr[i];
                ans[1] = i + 1;
            }
        }
        return ans;
    }
}