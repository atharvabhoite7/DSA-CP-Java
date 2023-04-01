class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        String str = "";

        for (char ch : s.toCharArray()) {
            int z = ch - 'a' + 1;
            str += z;
        }

        for (char ch : str.toCharArray()) {
            sum += ch - '0';
        }

        int m = sum;

        while (k > 1) {
            sum = 0;
            while (m > 0) {
                sum += m % 10;
                m /= 10;
            }
            m = sum;
            k--;
        }

        return sum;
    }
}