/**
 * 
 */
package problems;

import java.util.Scanner;

/**
 * @author PRATAP
 *
 */
public class FoodCommMess {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t, n, d;
		t = scanner.nextInt();
		n = scanner.nextInt();
		d = scanner.nextInt();
		int arr[] = new int[n];
		int totalWeight = 0;
		for (int i = 1; i <= t; i++) {
			for (int j = 0; j < n; j++) {
				arr[j] = scanner.nextInt();
				totalWeight += arr[j];
			}
		}
		int curr = 0, min = totalWeight, days = 0;
		boolean flag = true;
		for (int i = totalWeight; i > 0; i--) {
			curr = i;
			days = 0;
			for (int j = 0; j < n;) {
				if (arr[j] > i) {
					flag = false;
					break;
				}
				curr -= arr[j];
				if (curr == 0) {
					days++;
					curr = i;
					j++;
				} else if (curr > 0 && j == arr.length - 1) {
					days++;
					break;
				} else if (curr < 0) {
					days++;
					curr = i;
					continue;
				} else {
					j++;
				}
			}
			if (!flag)
				break;
			if (days <= d && i < min)
				min = i;
		}
		System.out.println(min);
		scanner.close();
	}

}
