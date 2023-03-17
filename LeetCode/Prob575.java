class Solution {
    public int distributeCandies(int[] candyType) {
        int k = candyType.length / 2;
        HashSet<Integer> list = new HashSet<>();
        long count = 0;

        for (int i = 0; i < candyType.length; i++) {
            if (!list.contains(candyType[i])) {
                list.add(candyType[i]);
                k--;
                count++;
            }

            if (k == 0) {
                break;
            }
        }
        return (int) count;
    }
}