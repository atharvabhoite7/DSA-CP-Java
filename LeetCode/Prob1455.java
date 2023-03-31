class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (check(arr[i], searchWord)) {
                return i + 1;
            }
        }
        return -1;
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