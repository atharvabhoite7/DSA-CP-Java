class Solution {
    public int numSub(String s) {
        int count = 0;
        int ans = 0;
        // char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                count++;
                ans = (ans + count) % (1000000007);
            } else {
                count = 0;
            }
        }
        return ans;
    }
}