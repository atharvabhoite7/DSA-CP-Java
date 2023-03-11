class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> o[1]));
        int sum = 0;

        for (int row = boxTypes.length - 1; row >= 0; row--) {
            while (boxTypes[row][0] != 0) {
                if (truckSize > 0) {
                    sum += boxTypes[row][1];
                    truckSize--;
                }
                boxTypes[row][0]--;
            }
            if (truckSize == 0) {
                break;
            }
        }
        return sum;
    }
}