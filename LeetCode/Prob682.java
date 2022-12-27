// Solution to problem number 682 of Leetcode

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                int doubleSum = 2 * stack.peek();
                stack.push(doubleSum);
            } else if (operations[i].equals("+")) {
                int currentScore = stack.pop();
                int prevScore = stack.peek();
                int newScore = currentScore + prevScore;
                stack.push(currentScore);
                stack.push(newScore);
            }

            else {
                int temp = Integer.valueOf(operations[i]);
                stack.push(temp);
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}