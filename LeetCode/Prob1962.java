// Solution to problem number 1962 of Leetcode

class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < piles.length; i++) {
            pq.add(piles[i]);
        }

        while (!pq.isEmpty() && k-- > 0) {
            int rem = pq.poll();
            int val = rem - (int) Math.floor(rem / 2);
            pq.add(val);
        }

        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}
