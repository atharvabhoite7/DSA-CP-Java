class Solution {
    public double myPow(double x, int n) {
        if (n == 0 || x == 1) {
            return 1;
        }

        if (x == 0)
            return 0;

        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = N * -1;
        }
        double temp = x;
        double res = 1;
        while (N > 0) {
            if (N % 2 == 1) {
                res *= temp;
            }
            temp *= temp;
            N /= 2;
        }
        return res;
    }
}