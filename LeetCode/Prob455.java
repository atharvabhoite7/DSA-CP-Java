class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int idx = 0;
        for (int i = 0; i < g.length; i++) {
            while (idx < s.length) {
                if (g[i] <= s[idx]) {
                    ans++;
                    idx++;
                    break;
                } else {
                    idx++;
                }
            }
        }
        return ans;
    }
}