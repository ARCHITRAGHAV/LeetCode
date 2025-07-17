class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    a.add(1);
                } else {
                    a.add(arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1));
                }
            }
            arr.add(a);
        }
        return arr.get(rowIndex);
    }
}