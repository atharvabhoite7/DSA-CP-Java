class Solution {
    public long findScore(int[] nums) {
        long score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> nums[a] == nums[b] ? a - b : nums[a] - nums[b]);

        for (int i = 0; i < nums.length; i++) {
            pq.add(i);
        }

        HashSet<Integer> vis = new HashSet<>();

        while (pq.size() > 0) {
            int curr = pq.poll();

            if (vis.contains(curr)) {
                continue;
            }

            vis.add(curr);
            score += nums[curr];

            if (curr > 0) {
                vis.add(curr - 1);
            }

            if (curr < nums.length - 1) {
                vis.add(curr + 1);
            }
        }
        return score;
    }
}