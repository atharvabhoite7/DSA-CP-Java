class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] < 0) {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < -1 * asteroids[i]) {
                    s.pop();
                }

                if (!s.isEmpty() && s.peek() == -1 * asteroids[i]) {
                    s.pop();
                } else if (!s.isEmpty() && s.peek() >= -1 * asteroids[i]) {
                    continue;
                } else {
                    s.push(asteroids[i]);
                }
            } else {
                s.push(asteroids[i]);
            }
        }
        int[] arr = new int[s.size()];

        for (int i = s.size() - 1; i >= 0; i--) {
            arr[i] = s.pop();
        }
        return arr;
    }
}