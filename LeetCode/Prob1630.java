class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            list.add(canMakeArithmeticProgression(Arrays.copyOfRange(nums, l[i], r[i] + 1)));
        }
        return list;
    }

    public boolean canMakeArithmeticProgression(int[] temp) {
        Arrays.sort(temp);

        int diff = temp[1] - temp[0];

        for (int i = 1; i < temp.length - 1; i++) {
            if (diff != temp[i + 1] - temp[i]) {
                return false;
            }
        }
        return true;
    }
}