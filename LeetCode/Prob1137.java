// Solution to problem number 1137 of Leetcode

class Solution {
    public int tribonacci(int n) {
        int prev2 = 0;
        int prev1 = 1;
        int prev = 1;

        int curr = 0;

        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        for (int i = 3; i <= n; i++) {
            curr = prev2 + prev1 + prev;
            prev2 = prev1;
            prev1 = prev;
            prev = curr;
        }

        return curr;
    }
}
