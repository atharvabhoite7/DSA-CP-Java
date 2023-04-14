class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int min = 0;
        List<Integer> minRow = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            min = Integer.MAX_VALUE;
            int colIdx = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colIdx = j;
                }
            }

            boolean isHappy = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colIdx] > min) {
                    isHappy = false;
                    break;
                }
            }

            if (isHappy) {
                minRow.add(min);
            }
        }

        return minRow;
    }
}