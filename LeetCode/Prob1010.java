class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        for (int i = 0; i < time.length; i++) {
            time[i] = time[i] % 60;
        }
        int count = 0;
        int[] arr = new int[61];

        for (int i = 0; i < time.length; i++) {
            if (arr[60 - time[i]] != 0) {
                count += arr[60 - time[i]];
            }

            if (time[i] == 0) {
                arr[60]++;
            } else {
                arr[time[i]]++;
            }
        }

        return count;
    }
}