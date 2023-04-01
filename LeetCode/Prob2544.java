class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String s = n + "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                sum += (-1 * (s.charAt(i) - '0'));
            } else {
                sum += (s.charAt(i) - '0');
            }
        }
        return sum;
    }
}