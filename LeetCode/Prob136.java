class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : nums) {
            if (list.contains(i)) {
                list.remove(Integer.valueOf(i));
            } else {
                list.add(i);
            }
        }
        return list.get(0);
    }
}