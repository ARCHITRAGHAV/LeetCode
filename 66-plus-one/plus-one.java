class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + carry <= 9) {
                arr.add(digits[i] + carry);
                carry = 0;
            } else {
                arr.add(0);
                carry = 1;
            }
        }
        if (carry == 1) {
            arr.add(1);
        }
        Collections.reverse(arr);
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}