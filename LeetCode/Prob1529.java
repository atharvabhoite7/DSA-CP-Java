class Solution {
    public int minFlips(String target) {
        char ch = '0';
        int count = 0;

        for (int i = 0; i < target.length(); i++) {
            if (ch != target.charAt(i)) {
                count++;
                ch = target.charAt(i);
            }
        }
        return count;
    }
}