class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int sum = 0;

        for (int i = 0; i < reward2.length; i++) {
            pq.add(reward1[i] - reward2[i]);
            sum += reward2[i];
        }

        while (k > 0) {
            sum += pq.poll();
            k--;
        }
        return sum;
    }
}