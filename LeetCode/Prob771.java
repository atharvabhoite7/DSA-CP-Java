// Solution to problem number 771 of Leetcode

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            list.add(ch);
        }
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            if (list.contains(ch)) {
                count++;
            }
        }
        return count;
    }
}
