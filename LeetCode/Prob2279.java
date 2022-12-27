// Solution to problem number 2279 of Leetcode

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] remRocks = new int[capacity.length];
        int count = 0;

        for (int i = 0; i < rocks.length; i++) {
            remRocks[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(remRocks);

        for (int i = 0; i < remRocks.length; i++) {
            if (additionalRocks >= remRocks[i]) {
                additionalRocks -= remRocks[i];
                count++;
            }
        }
        return count;
    }
}