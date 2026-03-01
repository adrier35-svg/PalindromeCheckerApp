import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "madam";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < original.length(); i++) {
            char ch = stack.pop();  // removes last inserted character

            if (original.charAt(i) != ch) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}