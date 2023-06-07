class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {

        int[] freq = new int[7];
        for (int i = 0; i < tops.length; i++) {
            freq[tops[i]]++;
        }

        for (int i = 0; i < bottoms.length; i++) {
            freq[bottoms[i]]++;
        }

        int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                idx = i;
            }
        }

        int ct = 0;
        int cb = 0;
        for (int i = 0; i < tops.length; i++) {
            if (idx != tops[i] && idx != bottoms[i]) {
                return -1;
            }

            if (idx != tops[i]) {
                ct++;
            } else if (idx != bottoms[i]) {
                cb++;
            }
        }
        return Math.min(ct, cb);

    }
}