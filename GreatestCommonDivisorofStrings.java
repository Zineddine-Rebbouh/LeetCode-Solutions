class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {

            int a = gcd(str1.length(), str2.length());
            return str1.substring(0, a);

        }
        return "";
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}

public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(sol.gcdOfStrings(str1, str2));
    }
}