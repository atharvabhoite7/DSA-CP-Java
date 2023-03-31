class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int idx = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            idx++;
            if (idx % 3 == 0) {
                continue;
            } else {
                sum += cost[i];
            }
        }
        return sum;
    }
}