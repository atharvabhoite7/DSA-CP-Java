class Solution {
    public boolean hasAlternatingBits(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            int num = n % 2;
            n /= 2;
            list.add(num);
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}