import java.util.Scanner;

public class PalindromeChecker {
    private final String checkedWord;
    private final boolean isPalindrome;

    public PalindromeChecker(String input) {
        String transformed = transformInput(input);
        this.checkedWord = transformed;
        this.isPalindrome = checkPalindrome(transformed);
        if (this.isPalindrome) {
            System.out.println("The word \"" + this.checkedWord + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + this.checkedWord + "\" is not a palindrome.");
        }
    }


    public static String transformInput(String input) {
        return input.toLowerCase().replace(",", "").replace("!", "");
    }

    public static boolean checkPalindrome(String input) {
        return input.equals(reverseString(input));
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        PalindromeChecker palindromeChecker = new PalindromeChecker(input);

    }
}
