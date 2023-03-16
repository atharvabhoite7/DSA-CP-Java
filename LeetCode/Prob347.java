class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        int[] arr = new int[k];
        int j = 0;
        while (k > 0) {
            int num = pq.remove();
            arr[j] = num;
            j++;
            k--;
        }
        return arr;
    }
}