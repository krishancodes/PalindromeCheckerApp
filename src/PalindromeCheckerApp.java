<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> bf2163b93da4673a769715103778aaf9073a7bac
public class PalindromeCheckerApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String input = sc.nextLine();

        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        if(input.equalsIgnoreCase(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
=======
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("This program checks whether a word is palindrome or not");

    }

>>>>>>> bf2163b93da4673a769715103778aaf9073a7bac
}