class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int lastVal = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int additive = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            ans = additive < lastVal ? ans - additive : ans + additive;
            lastVal = additive;
        }
        return ans;
    }
}