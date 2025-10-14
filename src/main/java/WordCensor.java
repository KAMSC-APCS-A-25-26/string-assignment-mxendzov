import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String censored1 = sentence.replace("dang",  "***");
        String censored2 = censored1.replace("nuts",  "***");
        String censored3 = censored2.replace("oops",  "***");
        String censored4 = censored3.replace("yikes",  "***");

        System.out.print(censored4);

        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes


        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
    }
}
