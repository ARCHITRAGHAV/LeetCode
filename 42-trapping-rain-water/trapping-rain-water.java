class Solution {
    public int trap(int[] height) {
        int n = height.length, trappedwater = 0;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < leftmax.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        rightmax[rightmax.length - 1] = height[n - 1];
        for (int i = rightmax.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater = trappedwater + (waterlevel - height[i]);
        }
        return trappedwater;
    }
}