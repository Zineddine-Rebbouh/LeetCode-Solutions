
import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int i = 0;
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        while (i < candies.length) {
            if (max < candies[i]) {
                max = candies[i];
            }
            i++;
        }
        i = 0;
        int avg = max - extraCandies;
        while (i < candies.length) {
            result.add(candies[i] >= avg);
            i++;
        }
        return result;
    }
}

// Test cases
public class KidsCandies {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(sol.kidsWithCandies(candies, extraCandies));
    }
}