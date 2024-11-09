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
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        return input;
    }

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        if (input.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        PalindromeChecker palindromeChecker = new PalindromeChecker(input);

    }
}