class Solution {
    public long minimumCost(String s) {
        long ans = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                ans += Math.min(i + 1, s.length() - 1 - i);
            }
        }

        return ans;
    }
}