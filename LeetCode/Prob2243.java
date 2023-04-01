class Solution {
    public String digitSum(String s, int k) {
        String ans = "";
        int sum = 0;
        int num = k;

        if (s.length() <= k) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
            num--;
            if ((num == 0) || (i == s.length() - 1)) {
                ans += sum + "";
                sum = 0;
                num = k;
            }
        }

        if (ans.length() <= k) {
            return ans;
        }
        return digitSum(ans, k);
    }
}