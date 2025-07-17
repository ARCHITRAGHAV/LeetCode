class Solution {
    public String reverseWords(String s) {
        String ans = "";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                str.append(s.charAt(i));
            } else {
                str.reverse();
                ans = ans + str + " ";
                str.delete(0, i);
            }
            if (i == (s.length() - 1)) {
                str.reverse();
                ans = ans + str;
                str.delete(0, i);
            }
        }
        return ans;
    }
}