class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        int max = 0;

        if (n <= 2) {
            return n;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 2;

                for (int k = j + 1; k < n; k++) {
                    int x = (points[j][0] - points[i][0]) * (points[k][1] - points[j][1]);
                    int y = (points[k][0] - points[j][0]) * (points[j][1] - points[i][1]);

                    if (x == y) {
                        temp++;
                    }
                    max = Math.max(max, temp);
                }

            }
        }
        return max;
    }
}