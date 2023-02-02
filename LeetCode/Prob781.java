// Solution to problem number 781 of Leetcode

class Solution {
    public int numRabbits(int[] answers) {
        int min = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < answers.length; i++) {
            if (!map.containsKey(answers[i]) || Objects.equals(map.get(answers[i]), 0) || answers[i] == 0) {
                map.put(answers[i], answers[i]);
                min += answers[i] + 1;
            } else {
                map.put(answers[i], map.get(answers[i]) - 1);
            }
        }
        return min;
    }
}