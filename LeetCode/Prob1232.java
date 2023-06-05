class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        } else {
            int x = coordinates[0][0], y = coordinates[0][1];
            int x1 = coordinates[1][0], y1 = coordinates[1][1];

            for (int i = 0; i < coordinates.length; i++) {
                int x2 = coordinates[i][0], y2 = coordinates[i][1];

                int p1 = (y1 - y) * (x2 - x1);
                int p2 = (y2 - y1) * (x1 - x);
                if (p1 != p2) {
                    return false;
                }

            }
            return true;
        }
    }
}