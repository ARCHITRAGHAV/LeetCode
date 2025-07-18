class Solution {
    public static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }

    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while (i < arr.length) {
            int idx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[i] == arr[idx])
                i++;
            else {
                swap(arr, i, idx);
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                ans.add(arr[i]);
        }
        return ans;
    }
}