class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // brute force
        // int col = 0;
        // for(int row=0; row<matrix.length; row++){
        // for(col=0; col<matrix[row].length; col++){
        // if(target == matrix[row][col]){
        // return true;
        // }
        // }
        // }
        // return false;

        // optimised soln
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else {
                if (target > matrix[row][col]) {
                    row++;
                } else {
                    col--;
                }
            }
        }
        return false;

    }
}