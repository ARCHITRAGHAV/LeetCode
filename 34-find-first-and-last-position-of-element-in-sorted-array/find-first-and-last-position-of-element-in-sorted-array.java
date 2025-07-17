class Solution {
    public int[] searchRange(int[] arr, int x) {
        ArrayList<Integer> a = new ArrayList<>();
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                index = mid;
                high = mid - 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        a.add(index);
        low = 0;
        high = arr.length - 1;
        index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                index = mid;
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        a.add(index);
        int[] newArr = new int[a.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = a.get(i);
        }
        return newArr;
    }
}