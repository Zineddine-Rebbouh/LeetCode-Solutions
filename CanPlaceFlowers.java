class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int index) {
        int co = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                co++;
            }
        }
        return co >= index;
    }
}

// Test cases

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] flowerbed = { 1, 0, 0, 0, 1 };
        System.out.println(sol.canPlaceFlowers(flowerbed, 1));
    }
}