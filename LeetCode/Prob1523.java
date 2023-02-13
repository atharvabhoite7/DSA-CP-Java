// Solution to problem number 1523 of Leetcode

class Solution {
    public int countOdds(int low, int high) {
        int num = high - low + 1;
        if (high % 2 == 0 || low % 2 == 0) {
            return num / 2;
        } else {
            return num / 2 + 1;
        }
    }
}