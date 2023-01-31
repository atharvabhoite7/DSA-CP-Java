// Solution to problem number 2549 of Leetcode

class Solution {
    public int distinctIntegers(int n) {
        if (n == 1) {
            return 1;
        }
        return n - 1;
    }
}