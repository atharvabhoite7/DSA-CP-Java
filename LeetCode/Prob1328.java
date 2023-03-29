class Solution {
    public String breakPalindrome(String palindrome) {

        if (palindrome.length() == 1) {
            return "";
        }

        char[] s = palindrome.toCharArray();
        for (int i = 0; i < palindrome.length(); i++) {
            if (palindrome.length() % 2 != 0) {
                if (i == s.length / 2) {
                    continue;
                }
            }
            if (s[i] != 'a') {
                s[i] = 'a';
                if (!isPalin(s)) {
                    break;
                }
            }

            if (i == palindrome.length() - 1 && s[i] == 'a') {
                s[i] = 'b';
            }
        }

        String ans = "";
        for (int i = 0; i < s.length; i++) {
            ans = ans + s[i];
        }
        return ans;

    }

    public boolean isPalin(char[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s != e) {
            if (arr[s] != arr[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}