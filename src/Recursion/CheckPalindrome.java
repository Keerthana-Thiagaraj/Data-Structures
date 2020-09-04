package Recursion;

// Check if a string is palindrome or not

public class CheckPalindrome {

    public static void main(String[] args) {
        String s = "madamm";
        if (findPalindrome(s, 0, s.length() - 1)) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }

    private static boolean findPalindrome(String s, int low, int high) {

        if (s == null || s.length() == 0)
            return false;
        if (low >= high) {
            return true;    // setting the base condition, at which no more comparisons are required.
        }
        if (s.charAt(low) != s.charAt(high)) {
            return false;   // If any character is unmatched
        }

        return findPalindrome(s, low + 1, high - 1);
    }
}
