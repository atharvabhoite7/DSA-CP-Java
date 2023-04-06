class Solution {
    public int minTimeToType(String word) {
        int sum = 0;
        int prev = 1;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int curr = ch - 'a' + 1;
            int diff = Math.abs(curr - prev);
            sum += Math.min(26 - diff, diff);
            prev = curr;
        }
        return sum + word.length();
    }
}