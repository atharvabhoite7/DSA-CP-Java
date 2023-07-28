class Solution {
    public int countGoodNumbers(long n) {
        if (n % 2 == 0) {
            long half = n / 2;
            long even = pow(5, half);
            long odd = pow(4, half);

            return (int) ((even * odd) % 1000000007);
        } else {
            long half = n / 2;
            long even = pow(5, half + 1);
            long odd = pow(4, half);

            return (int) ((even * odd) % 1000000007);
        }
    }

    public long pow(long n, long p) {
        long ans = 1;

        while (p > 0) {
            if (p % 2 == 0) {
                n *= n;
                p /= 2;
                n %= 1000000007;
            } else {
                ans = ans * n;
                p--;
                ans %= 1000000007;
            }
        }
        return ans;
    }
}