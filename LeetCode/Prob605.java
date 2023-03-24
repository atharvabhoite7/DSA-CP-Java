class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count1 = 0;
        int count0 = 0;

        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            n--;
        }
        boolean flag = true;
        if (flowerbed[0] == 0) {
            flag = false;
        } else {
            flag = true;
        }

        for (int i = 0; i < flowerbed.length - 1; i++) {
            if (flag == false && flowerbed[i] != 1 && flowerbed[i + 1] != 1) {
                n--;
                flag = true;
                flowerbed[i] = 1;
                continue;
            }

            if (flowerbed[i] == 1) {
                flag = true;
            } else {
                flag = false;
            }
        }

        if (flowerbed.length > 2 && flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
            n--;
        }

        if (n > 0) {
            return false;
        } else {
            return true;
        }

    }
}