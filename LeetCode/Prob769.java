class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length - 1;
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i <= n; i++) {
            pq.add(arr[i]);

            if (pq.peek() == i) {
                count++;
                pq.clear();
            }
        }
        return count;
    }
}
