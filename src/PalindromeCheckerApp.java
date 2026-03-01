public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "madam";

        // Convert string to character array
        char[] chars = original.toCharArray();

        // Two-pointer variables
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Compare characters using two-pointer technique
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}