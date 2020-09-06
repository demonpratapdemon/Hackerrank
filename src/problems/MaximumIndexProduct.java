/**
 * 
 */
package problems;

import java.util.Scanner;

/**
 * @author PRATAP
 *
 */
public class MaximumIndexProduct {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[arrCount];

		String[] arrItems = scanner.nextLine().split(" ");
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int arrItr = 0; arrItr < arrCount; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr]);
			arr[arrItr] = arrItem;
		}

		long result = solve(arr);
		System.out.println(result);
	}

	// Complete the solve function below.
	static long solve(int[] arr) {

		long maxIndexProduct = 0, left = -1, right = -1, currentIndexProduct;
		for (int i = 1; i < arr.length - 1; i++) {
			left = -1;
			right = -1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[i]) {
					left = j;
					break;
				}
			}
			if (left == -1)
				continue;
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] > arr[i]) {
					right = k;
					break;
				}
			}
			if (right == -1)
				continue;
			currentIndexProduct = (left + 1) * (right + 1);
			if (currentIndexProduct >= maxIndexProduct)
				maxIndexProduct = currentIndexProduct;
		}
		return maxIndexProduct;
	}

}
