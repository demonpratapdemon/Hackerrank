/**
 * 
 */
package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author PRATAP
 *
 */
public class SockMerchant {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);
		System.out.println(result);
	}

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int pairs = 0;
		Arrays.sort(ar);
		for (int i = 0; i < n; i++) {
			if (i < n - 1 && ar[i] == ar[i + 1]) {
				pairs++;
				i++;
			}
		}
		return pairs;
	}

}
