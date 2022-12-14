// Solution to problem number 1184 of Leetcode

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveCount++;
            } else if (bills[i] == 10) {
                if (fiveCount-- == 0) {
                    return false;
                }
                tenCount++;
            } else if (bills[i] == 20) {
                if (tenCount == 0) {
                    if (fiveCount >= 3) {
                        fiveCount -= 3;
                    } else {
                        return false;
                    }
                } else if (fiveCount == 0) {
                    return false;
                } else {
                    tenCount--;
                    fiveCount--;
                }

            }
        }
        return true;

    }
}