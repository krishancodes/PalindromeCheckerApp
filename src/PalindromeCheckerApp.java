/**
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * Demonstrates palindrome validation using a hardcoded string.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("-----------------------");

        // Hardcoded string
        String input = "madam";

        boolean isPalindrome = true;

        // Loop till half of the string
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

    }
}