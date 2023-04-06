class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean check(int num) {
        List<Integer> list = new ArrayList<>();
        int ans = num;
        while (num > 0) {
            int temp = num % 10;
            if (temp == 0) {
                return false;
            }
            list.add(temp);
            num /= 10;
        }

        for (int i = 0; i < list.size(); i++) {
            if (ans % list.get(i) != 0) {
                return false;
            }
        }
        return true;
    }
}