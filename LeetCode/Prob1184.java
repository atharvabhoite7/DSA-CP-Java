// Solution to problem number 1184 of Leetcode

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (destination < start) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int count1 = 0;
        int count2 = 0;

        for (int i = start; i < destination; i++) {
            count1 += distance[i];
        }

        for (int i = destination; i < distance.length; i++) {
            count2 += distance[i];
        }

        for (int i = 0; i < start; i++) {
            count2 += distance[i];
        }

        int min = Math.min(count1, count2);
        return min;
    }

}