class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        int l = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                boolean pal = false;

                if (str.length() > l) {
                    if (isPal(str) == true) {
                        l = str.length();
                        ans = str;
                    }
                }
            }

        }
        return ans;
    }

    public static boolean isPal(String s) {
        int i = 0;
        int e = s.length() - 1;

        while (i < e) {
            if (s.charAt(i) != s.charAt(e)) {
                return false;
            }
            i++;
            e--;
        }
        return true;
    }
}