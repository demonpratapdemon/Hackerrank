package problems;

import java.util.Scanner;

/**
 * @author PRATAP
 *
 */
public class SherlockAndGCD {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int aCount = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] a = new int[aCount];

			String[] aItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int aItr = 0; aItr < aCount; aItr++) {
				int aItem = Integer.parseInt(aItems[aItr]);
				a[aItr] = aItem;
			}

			String result = solve(a);
			System.out.println(result);
		}

	}

	// Complete the solve function below.
	static String solve(int[] a) {
		int gcd = a[0];
		for (int i = 1; i < a.length; i++) {
			gcd = gcd(gcd, a[i]);
		}
		if (gcd == 1)
			return "YES";
		else
			return "NO";
	}

	public static int gcd(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		return gcd;
	}
}
