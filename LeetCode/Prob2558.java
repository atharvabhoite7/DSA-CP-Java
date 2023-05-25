class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        long ans = 0;

        for (int i : gifts) {
            pq.add(i);
        }

        while (k > 0) {
            int num = pq.poll();
            int temp = (int) Math.sqrt(num);
            pq.add(temp);
            k--;
        }

        for (int i : pq) {
            ans += i;
        }

        System.out.print(pq);
        return ans;
    }
}