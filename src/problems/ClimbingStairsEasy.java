/**
 * 
 */
package problems;

import java.util.Scanner;

/**
 * @author PRATAP
 *
 */
public class ClimbingStairsEasy {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, n;
		t = scanner.nextInt();
		int noOfWays = 0;
		for (int i = 1; i <= t; i++) {
			n = scanner.nextInt();
			noOfWays = 0;
			for (int j = 1; j <= n; j += 2) {
				
			}
			System.out.println(noOfWays);
		}
	}

}
