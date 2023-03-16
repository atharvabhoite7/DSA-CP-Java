class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        int total = s.length();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == letter) {
                count++;
            }
        }
        int perc = (count * 100 / total);
        return perc;
    }
}