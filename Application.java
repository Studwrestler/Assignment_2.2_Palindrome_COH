import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String cleanedInput = input.toLowerCase().replaceAll("[^a-z]", "");

		boolean isPalindrome = PalindromeChecker.checkPalindrome(cleanedInput);
		if (isPalindrome) {
			System.out.println("It's a palindrome!");
		} else {
			System.out.println("It's not a palindrome.");
		}
	}
}
