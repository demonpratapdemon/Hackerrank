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
public class PairsOfDiffernece {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int result = pairs(k, arr);
		System.out.println(result);

		scanner.close();
	}

	// Complete the pairs function below.
	static int pairs(int k, int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			pos = Arrays.binarySearch(arr, arr[i] + k);
			if (pos >= 0)
				count++;
		}
		return count;
	}
}
