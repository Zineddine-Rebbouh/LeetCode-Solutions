
import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int right = s.length() - 1;
        int left = 0;

        char[] c = s.toCharArray();

        while (left < right) {
            if (vowels.contains(String.valueOf(c[left])) && vowels.contains(String.valueOf(c[right]))) {
                swap(c, left, right);
                left++;
                right--;
            } else {
                if (vowels.contains(String.valueOf(c[left]))) {
                    right--;
                } else if (vowels.contains(String.valueOf(c[right]))) {
                    left++;
                } else {
                    left++;
                    right--;
                }
            }
        }
        return new String(c); // Return the modified string
    }

    private void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}

public class SwapVowels {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String reversed = solution.reverseVowels("leetcode");
        System.out.println(reversed); // Outputs: Hollo, Werld!
        System.out.println("43");

    }
}
