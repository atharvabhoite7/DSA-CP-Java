class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i <= j) {
            int min = Math.min(height[i], height[j]);
            int dist = j - i;
            max = Math.max(dist * min, max);
            if (height[i] < height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            } else {
                i++;
                j--;
            }
        }

        return max;

    }
}