class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        // StringBuilder str = new StringBuilder();
        char[] ch = s.toCharArray();
        long sum = 0;
        long[] total = new long[shifts.length];
        for (int i = shifts.length - 1; i >= 0; i--) {
            sum += shifts[i];
            total[i] = sum;
        }

        for (int i = 0; i < s.length(); i++) {
            long a = ((int) (ch[i] - 97)) + total[i];
            ch[i] = (char) ('a' + (a % 26));

        }
        return String.valueOf(ch);
    }
}