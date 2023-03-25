class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = 0;
        char ch = s.charAt(0);

        if (s.length() < 2) {
            return s.length();
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
                max = Math.max(count, max);
            } else {
                max = Math.max(count, max);
                ch = s.charAt(i);
                count = 1;
            }
        }
        return max;
    }
}