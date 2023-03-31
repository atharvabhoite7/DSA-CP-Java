class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (check(words[i], s)) {
                count++;
            }
        }
        return count;
    }

    public boolean check(String str, String s) {
        if (str.length() > s.length()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}