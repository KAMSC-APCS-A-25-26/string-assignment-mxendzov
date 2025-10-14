import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String ogWord = sc.nextLine();

        String lcWord = ogWord.toLowerCase();

        String revWord = new StringBuilder(lcWord).reverse().toString();

        if (lcWord.equals(revWord))
            System.out.println(ogWord + " is a palindrome!");
        else
            System.out.println(ogWord + " is NOT a palindrome.");
    }
}



// TODO: Create a Scanner and read a full line from the user with nextLine().
        //       Keep the original input string so you can print it in the final message.

        // TODO: Build a lowercase version of the input for checking (case-insensitive comparison).
        //       (You don't need to remove spaces/punctuation for the current tests.)

        // TODO: Determine whether the lowercase string reads the same forwards and backwards.
        //       Tip: compare it to a reversed copy of itself.

        // TODO: Treat single-character inputs as palindromes (the above check will already handle this).

        // TODO: Print EXACTLY ONE of the following lines (no extra punctuation/labels):
        //       "<original> is a palindrome"
        //       "<original> is not a palindrome"
        //       where <original> is exactly what the user typed (preserve casing).

