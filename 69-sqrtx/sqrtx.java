class Solution {
    public int mySqrt(int n) {
        long root = 0;
        long low = 0;
        long high = n;
        while (low <= high) {
            long mid = (low + high) / 2;
            if ((mid * mid) > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
                root = mid;
            }
        }
        return (int) root;
    }
}