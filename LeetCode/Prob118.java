class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ans.add(getRow(i));
        }

        return ans;
    }

    public List<Integer> getRow(int rowIndex) {
        int idx = rowIndex + 1;
        List<Integer> list = new ArrayList<>();
        long k = 1;

        for (int i = 1; i <= idx; i++) {
            list.add((int) k);
            k = k * (idx - i) / i;
        }
        return list;
    }
}