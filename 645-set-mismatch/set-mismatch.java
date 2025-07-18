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
            if (arr[i] == i + 1) {
                i++;
            } else {
                int idx = arr[i] - 1;
                swap(arr, idx, i);
                if (arr[i] == arr[idx])
                    i++;
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