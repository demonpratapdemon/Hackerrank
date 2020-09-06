/**
 * 
 */
package problems;

import java.util.Scanner;

/**
 * @author PRATAP
 *
 */
public class FlippingBits {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			long n = scanner.nextLong();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			long result = flippingBits(n);
			System.out.println(result);
		}
		scanner.close();
	}

	// Complete the flippingBits function below.
	static long flippingBits(long n) {

		String binary = convertToBinary(n);
		long result = 0;
		int k = 31;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '0')
				result += 1 * Math.pow(2, k);
			k--;
		}
		return result;
	}

	private static String convertToBinary(long n) {
		// TODO Auto-generated method stub

		String str = "";
		while (n > 0) {
			str = n % 2 + str;
			n /= 2;
		}
		int x = 32- str.length();
		for (int i = 1; i <= x; i++) {
			str = "0" + str;
		}
		return str;
	}

}
