class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> listEve = new ArrayList<Integer>();
        List<Integer> listOdd = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                listEve.add(nums[i]);
            } else {
                listOdd.add(nums[i]);
            }
        }

        int o = 0;
        int e = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = listEve.get(e);
                e++;
            } else {
                nums[i] = listOdd.get(o);
                o++;
            }
        }
        return nums;
    }
}