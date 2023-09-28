import java.util.Scanner;
/**
 * The main class of the palindrome checker
 * @author Chase
 * CS215 Lab 2.2 9-28-23
 */
public class Application {
	/**
	 * Default
	 */
	Application(){
		
	}
    /**
     * The main method for running the palindrome checker application.
     *
     * @param args The command-line arguments (not used in this application).
     */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String cleanedInput = input.toLowerCase().replaceAll("[^a-z]", "");

		boolean isPalindrome = Palindrome.checkPalindrome(cleanedInput);
		if (isPalindrome) {
			System.out.println("It's a palindrome!");
		} else {
			System.out.println("It's not a palindrome.");
		}
	}//end main
}//end class
