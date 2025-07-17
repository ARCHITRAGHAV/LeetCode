class Solution {
    public String toLowerCase(String s) {
        StringBuilder s1 = new StringBuilder(s);
        for (int i = 0; i < s1.length(); i++) {
            int ascii = s1.charAt(i);
            if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90) {
                ascii += 32;
                s1.setCharAt(i, (char) ascii);
            }
        }
        return s1.toString();
    }
}