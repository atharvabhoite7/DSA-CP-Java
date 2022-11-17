// Solution to problem number 1332 of Leetcode

class Solution {
    public int removePalindromeSub(String s) {
        if (isPalindrome(s))
            return 1;
        return 2;
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int n = s.length();
        while (i <= n / 2) {
            if (s.charAt(i) != s.charAt(n - 1 - i++))
                return false;
        }
        return true;
    }
}