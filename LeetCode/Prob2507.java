class Solution {
    public int smallestValue(int n) {
        int ans = 0;
        while (true) {
            int sum = 0;
            for (int i = 2; i <= n; i++) {
                if (prime(i)) {
                    while (n % i == 0) {
                        sum += i;
                        n /= i;
                    }
                }
            }

            int res = sum;

            if (ans == res) {
                break;
            } else {
                ans = res;
            }
            n = res;
        }
        return ans;
    }

    public boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}