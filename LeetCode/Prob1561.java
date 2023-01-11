// Solution to problem number 1561 of Leetcode

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        ArrayList<Integer> list = new ArrayList<>();

        int n = (piles.length) / 3;

        for (int i = piles.length - 2; i >= n - 1; i = i - 2) {
            list.add(piles[i]);
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}