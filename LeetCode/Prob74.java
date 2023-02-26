class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (target == matrix[row][col]) {
                    return true;
                }
            }
        }
        return false;
    }
}