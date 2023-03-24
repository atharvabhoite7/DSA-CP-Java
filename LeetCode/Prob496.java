class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // ArrayList<Integer> list = new ArrayList<Integer>()

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = findGreat(nums2, nums1[i]);
        }

        return ans;
    }

    public static int findGreat(int[] arr, int n) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                flag = true;
            }

            if (flag == true && arr[i] > n) {
                return arr[i];
            }
        }
        return -1;
    }
}