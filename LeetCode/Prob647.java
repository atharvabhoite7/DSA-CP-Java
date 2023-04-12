class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPal(s.substring(i, j + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPal(String str) {
        int i = 0;
        int e = str.length() - 1;
        while (i <= e) {
            if (str.charAt(i) != str.charAt(e)) {
                return false;
            }
            i++;
            e--;
        }
        return true;
    }
}