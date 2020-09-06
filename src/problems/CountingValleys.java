/**
 * 
 */
package problems;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author PRATAP
 *
 */
public class CountingValleys {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);
		System.out.println(result);
	}

	static int countingValleys(int n, String s) {

		Stack<Character> stack = new Stack<Character>();
		int noOfValleys = 0;
		for (int i = 0; i < n; i++) {
			if (stack.isEmpty())
				stack.push(s.charAt(i));
			else if (!stack.isEmpty() && stack.peek() == s.charAt(i))
				stack.push(s.charAt(i));
			if (!stack.isEmpty() && s.charAt(i) == 'D' && stack.peek() == 'U') {
				stack.pop();
			} else if (!stack.isEmpty() && s.charAt(i) == 'U' && stack.peek() == 'D') {
				stack.pop();
			}
			if (stack.isEmpty() && s.charAt(i) == 'U')
				noOfValleys++;
		}
		return noOfValleys;
	}

}
