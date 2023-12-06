class Solution {
    public int totalMoney(int n) {
        int div = n / 7;
        int rem = n % 7;

        int sum1to7 = (7 * 8) / 2;
        int ans = 0;
        ans += (sum1to7) * div;
        ans += 7 * (div * (div - 1)) / 2;
        int last = div + 1;

        if (rem > 0) {
            for (int j = 1; j <= rem; j++) {
                ans += last;
                last++;
            }
        }
        return ans;
    }
}