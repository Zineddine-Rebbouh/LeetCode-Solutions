class Solution {
    public String mergeAlternately(String word1, String word2) {
        if (word1.length() == 0)
            return word2;
        if (word2.length() == 0)
            return word1;

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < word2.length() && i < word1.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }

        if (word1.length() > word2.length()) {
            result.append(word1.substring(word2.length(), word1.length()));
        } else {
            result.append(word2.substring(word1.length(), word2.length()));
        }
        return result.toString();
    }
}

public class mergeStrings {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(sol.mergeAlternately(word1, word2));
    }
}

// Performance: StringBuilder is mutable and doesn’t create new objects for each
// concatenation, unlike String which is immutable.
// Memory Efficiency: Reduces memory overhead due to fewer intermediate String
// objects.
// Readability: Using StringBuilder makes the intention of building a string
// more explicit.