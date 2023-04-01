class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int val = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        if (sum == val) {
            return sum;
        }

        return addDigits(sum);
    }
}