// Solution to problem number 1952 of Leetcode

class Solution {
    public boolean isThree(int n) {
        int count = 2;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 3) {
            return true;
        }
        return false;
    }
}