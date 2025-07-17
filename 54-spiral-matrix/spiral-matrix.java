class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> li = new ArrayList<>();
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                li.add(matrix[startRow][i]);
            }
            for (int j = startRow + 1; j <= endRow; j++) {
                li.add(matrix[j][endCol]);
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                li.add(matrix[endRow][i]);
            }
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                if (startCol == endCol) {
                    break;
                }
                li.add(matrix[j][startRow]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return li;
    }
}