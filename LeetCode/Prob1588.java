class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if ((j - i) % 2 == 0) {
                    ans += sum;
                }
            }
        }
        return ans;
    }
}