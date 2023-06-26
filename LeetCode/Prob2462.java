class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pq1 = new PriorityQueue();
        PriorityQueue<Integer> pq2 = new PriorityQueue();

        int num = k;
        long ans = 0;
        int s = 0;
        int e = costs.length - 1;
        while (k-- > 0) {
            while (pq1.size() < candidates && s <= e) {
                pq1.offer(costs[s++]);
            }
            while (pq2.size() < candidates && s <= e) {
                pq2.offer(costs[e--]);
            }

            int t1 = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
            int t2 = pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;
            if (t1 <= t2) {
                ans += t1;
                pq1.poll();
            } else {
                ans += t2;
                pq2.poll();
            }
        }

        return ans;
    }
}