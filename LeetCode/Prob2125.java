class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int last = 0;
        int idx = 0;
        int[] arr = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            int ct = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                char ch = bank[i].charAt(j);
                if (ch == '1') {
                    ct++;
                }
            }
            if (last == 0) {
                last = ct;
                idx = i;
            }
            arr[i] = ct;
        }

        for (int i = idx + 1; i < arr.length; i++) {
            if (arr[i] == 0)
                continue;
            ans += last * arr[i];
            last = arr[i];
        }

        return ans;
    }
}