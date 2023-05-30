class Solution {
    public int trap(int[] height) {
        int lMax = 0, rMax = 0, l = 0, r = height.length - 1, count = 0;

        while (l < r) {
            lMax = Math.max(lMax, height[l]);
            rMax = Math.max(rMax, height[r]);

            if (lMax < rMax) {
                count += lMax - height[l];
                l++;
            } else {
                count += rMax - height[r];
                r--;
            }
        }
        return count;
    }
}
