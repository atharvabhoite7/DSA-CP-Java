class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            diff = Math.min(diff, Math.abs(arr[i] - arr[i - 1]));
        }

        List<List<Integer>> ans = new ArrayList<>();
        if (arr.length == 2) {
            List<Integer> list = new ArrayList<>();
            list.add(arr[0], arr[1]);
        }

        for (int i = 1; i < arr.length; i++) {
            if (diff == Math.abs(arr[i - 1] - arr[i])) {
                ans.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return ans;

    }
}