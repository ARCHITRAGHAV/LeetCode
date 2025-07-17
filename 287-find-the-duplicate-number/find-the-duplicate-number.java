class Solution {
    public static void swap(int[] arr, int idx, int i) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }

    public int findDuplicate(int[] arr) {
        int n = arr.length - 1;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1) {
                i++;
            } else {
                int idx = arr[i] - 1;
                swap(arr, idx, i);
                if (arr[i] == arr[idx]) return arr[i]; 
            }
        }
        return n;
    }
}