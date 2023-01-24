// Solution to problem number 2413 of Leetcode

class Solution {
    public int smallestEvenMultiple(int n) {

        for (int i = 1; i <= 10 * n; i++) {
            if (i % 2 == 0 && i % n == 0) {
                return i;
            }
        }
        return -1;
    }
}