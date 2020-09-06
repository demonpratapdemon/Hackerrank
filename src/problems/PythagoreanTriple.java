/**
 * 
 */
package problems;

import java.util.Scanner;

/**
 * @author PRATAP
 *
 */
public class PythagoreanTriple {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] triple = pythagoreanTriple(a);
		for (int i = 0; i < triple.length; i++) {
			System.out.print(triple[i] + " ");
		}
	}

	// Complete the pythagoreanTriple function below.
	static int[] pythagoreanTriple(int a) {

		/*
		 * Double b, c, z, sqrt; int k = (a - 1) / 2; for (int i = a + k;; i += k) { z =
		 * Double.parseDouble(String.valueOf((i * i) - (a * a))); sqrt = Math.sqrt(z); z
		 * = Math.ceil(sqrt); if (sqrt - z == 0) { c =
		 * Double.parseDouble(String.valueOf(i)); b = z; break; }
		 * 
		 * }
		 */
		int v, b, c;
		if (a % 2 == 0) {
			b = ((a * a) / 4) - 1;
			c = b + 2;
		} else {
			v = (a - 1) / 2;
			b = 2 * v * v + 2 * v;
			c = 2 * v * v + 2 * v + 1;
		}
		return new int[] { a, b, c };
	}

}
