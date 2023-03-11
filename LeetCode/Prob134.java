class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < cost.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalCost > totalGas) {
            return -1;
        }

        int n = cost.length;
        int curr = 0;

        for (int i = 0; i < n; i++) {
            tank += gas[i] - cost[i];
            if (tank < 0) {
                curr = i + 1;
                tank = 0;
            }
        }

        return curr;
    }
}