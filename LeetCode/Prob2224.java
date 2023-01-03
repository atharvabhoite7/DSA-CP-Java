// Solution to problem number 2224 of Leetcode

class Solution {
    public int convertTime(String current, String correct) {
        String currentStr = String.valueOf(current);
        String correctStr = String.valueOf(correct);

        if (currentStr.equals(correctStr)) {
            return 0;
        }

        String currHourStr = currentStr.substring(0, 2);
        String currMinStr = currentStr.substring(3);

        String corrHourStr = correctStr.substring(0, 2);
        String corrMinStr = correctStr.substring(3);

        int currHour = Integer.parseInt(currHourStr);
        int currMin = Integer.parseInt(currMinStr);
        int corrHour = Integer.parseInt(corrHourStr);
        int corrMin = Integer.parseInt(corrMinStr);

        int currentTime = (currHour * 60) + currMin;
        int correctTime = (corrHour * 60) + corrMin;

        int diff = correctTime - currentTime;

        int count = 0;
        while (diff > 0) {
            if (diff >= 60) {
                diff -= 60;
                count++;
            } else if (diff >= 15) {
                diff -= 15;
                count++;
            } else if (diff >= 5) {
                diff -= 5;
                count++;
            } else {
                diff -= 1;
                count++;
            }
        }
        return count;
    }
}
