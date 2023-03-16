class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());

        while (k > 0) {
            k -= pq.poll();
        }

        if (k < 0) {
            return pq.size() + 1;
        } else {
            return pq.size();
        }

    }
}