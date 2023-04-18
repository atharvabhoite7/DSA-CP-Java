class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ans.length; i++) {
            if (boxes.charAt(i) == '1') {
                list.add(i);
            }
        }

        int sum = 0;
        for (int i = 0; i < ans.length; i++) {
            sum = 0;
            for (int j = 0; j < list.size(); j++) {
                sum += Math.abs(i - list.get(j));
            }
            ans[i] = sum;
        }
        return ans;
    }
}