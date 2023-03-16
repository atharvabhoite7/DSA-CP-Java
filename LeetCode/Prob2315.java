class Solution {
    public int countAsterisks(String s) {
        int start = -1;
        int dash = 0;
        int star = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '|') {
                start = i;
                break;
            } else if (ch == '*') {
                star++;
            }
        }

        if (start == -1) {
            return star;
        }

        for (int i = start; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '|') {
                dash++;
            }

            if (dash % 2 == 0) {
                if (ch == '*') {
                    star++;
                }
            }
        }
        return star;
    }
}