/**
 * 
 */
package problems;

import java.util.Scanner;

/**
 * @author PRATAP
 *
 */
public class SansaAndXOR {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] arr = new int[n];

			String[] arrItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int arrItem = Integer.parseInt(arrItems[i]);
				arr[i] = arrItem;
			}

			int result = sansaXor(arr);
			System.out.println(result);
		}
	}

	// Complete the sansaXor function below.
	static int sansaXor(int[] arr) {

		/*
		 * XOR of nos which are in even will result to 0 and those which are in odd
		 * should be taken into consideration for XOR-ing if array length is even, all
		 * the elements will appear even no of times if array length is odd, alternate
		 * elements will appear in odd nos starting from 0
		 */
		if (arr.length % 2 == 0)
			return 0;
		else {
			int xor = 0;
			for (int i = 0; i < arr.length; i += 2) {
				xor ^= arr[i];
			}
			return xor;
		}
	}

}
