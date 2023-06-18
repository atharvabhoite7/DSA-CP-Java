class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int ct = 0;
        while (mainTank >= 5) {
            ct += 5;
            mainTank -= 5;
            if (additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }

        if (mainTank > 0) {
            ct += mainTank;
        }

        return ct * 10;
    }
}