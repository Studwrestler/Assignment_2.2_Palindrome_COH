import java.util.Stack;
/**
 * Palindrome does the main checking if its a palindrome
 * @author Chase
 *
 */
public class Palindrome {
	public static boolean checkPalindrome(String cleanedInput) {

		Stack<Character> stack = new Stack<>();

		for (char c : cleanedInput.toCharArray()) {
			stack.push(c);
		}

		StringBuilder reversed = new StringBuilder();
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}

		return cleanedInput.equals(reversed.toString());
	}//end check palindrome
}//end class
