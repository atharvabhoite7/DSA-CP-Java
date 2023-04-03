class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int s = 0;
            int e = potions.length - 1;

            while (s <= e) {
                int mid = (s + e) >> 1;

                if ((long) spells[i] * (long) potions[mid] >= success) {
                    e = mid - 1;
                } else if ((long) spells[i] * (long) potions[mid] < success) {
                    s = mid + 1;
                }
            }
            ans[i] = potions.length - s;
        }
        return ans;
    }
}