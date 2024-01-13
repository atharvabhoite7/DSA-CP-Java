class Solution {
    public boolean halvesAreAlike(String s) {
        int ct = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ct++;
            }
        }

        for (int i = s.length() / 2; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ct--;
            }
        }

        return ct == 0 ? true : false;

    }
}