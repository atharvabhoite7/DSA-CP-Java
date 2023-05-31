class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
                (a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));

        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);
        }

        int[][] ans = new int[k][2];
        int idx = 0;
        while (k > 0) {
            ans[idx++] = pq.poll();
            k--;
        }
        return ans;

    }
}