class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for (int row = 0; row < intervals.length; row++) {
            if (intervals[row][0] >= prev) {
                prev = intervals[row][1];
            } else {
                count++;
            }
        }
        return count;

    }
}