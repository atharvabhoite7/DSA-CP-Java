class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int temp = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] > capacity) {
                steps += i;
                capacity = temp;
                steps += i + 1;
                capacity -= plants[i];
                continue;
            }

            if (plants[i] <= capacity) {
                capacity -= plants[i];
                steps++;
            }

        }
        return steps;
    }
}