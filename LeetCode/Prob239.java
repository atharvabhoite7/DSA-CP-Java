class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int i = 0;
        Deque<Integer> deque = new LinkedList<>();
        for (int j = 0; j < nums.length; j++) {
            while (!deque.isEmpty() && deque.peekLast() < nums[j]) {
                deque.pollLast();
            }
            deque.offerLast(nums[j]);

            if (j - i + 1 >= k) {
                ans[i] = deque.peekFirst();
                if (deque.peekFirst() == nums[i]) {
                    deque.pollFirst();
                }
                i++;
            }
        }
        return ans;
    }
}