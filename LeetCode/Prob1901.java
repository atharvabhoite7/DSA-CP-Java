class Solution {
    public int[] findPeakGrid(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int top = 0;
                int bottom = 0;
                int left = 0;
                int right = 0;

                if (i - 1 < 0) {
                    top = -1;
                } else {
                    top = mat[i - 1][j];
                }

                if (i + 1 > mat.length - 1) {
                    bottom = -1;
                } else {
                    bottom = mat[i + 1][j];
                }

                if (j - 1 < 0) {
                    left = -1;
                } else {
                    left = mat[i][j - 1];
                }

                if (j + 1 > mat[0].length - 1) {
                    right = -1;
                } else {
                    right = mat[i][j + 1];
                }

                if (mat[i][j] > left && mat[i][j] > right && mat[i][j] > top && mat[i][j] > bottom) {
                    int arr[] = { i, j };
                    return arr;
                }
            }
        }
        return mat[0];
    }
}