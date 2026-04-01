import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {
        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("This program checks whether a word is palindrome or not");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if(isPalindrome(word)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}