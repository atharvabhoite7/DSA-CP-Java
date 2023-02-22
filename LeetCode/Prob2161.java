class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> listSmall = new ArrayList<>();
        ArrayList<Integer> listBig = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                listBig.add(nums[i]);
            } else if (nums[i] == pivot) {
                listBig.add(0, nums[i]);
            } else {
                listSmall.add(nums[i]);
            }
        }

        listSmall.addAll(listBig);

        int[] arr = new int[listSmall.size()];

        for (int i = 0; i < listSmall.size(); i++) {
            arr[i] = listSmall.get(i);
        }

        return arr;

    }
}