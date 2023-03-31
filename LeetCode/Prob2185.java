class Solution {
    public int prefixCount(String[] words, String pref) {

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (check(words[i], pref)) {
                count++;
            }
        }
        return count;
    }

    public boolean check(String str, String s) {
        if (str.length() < s.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}