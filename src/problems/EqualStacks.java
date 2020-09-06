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
public class EqualStacks {

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] n1N2N3 = scanner.nextLine().split(" ");

		int n1 = Integer.parseInt(n1N2N3[0].trim());

		int n2 = Integer.parseInt(n1N2N3[1].trim());

		int n3 = Integer.parseInt(n1N2N3[2].trim());

		int[] h1 = new int[n1];

		String[] h1Items = scanner.nextLine().split(" ");

		for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
			int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
			h1[h1Itr] = h1Item;
		}

		int[] h2 = new int[n2];

		String[] h2Items = scanner.nextLine().split(" ");

		for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
			int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
			h2[h2Itr] = h2Item;
		}

		int[] h3 = new int[n3];

		String[] h3Items = scanner.nextLine().split(" ");

		for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
			int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
			h3[h3Itr] = h3Item;
		}

		int result = equalStacks(h1, h2, h3);
		System.out.println(result);
	}

	/*
	 * Complete the equalStacks function below.
	 */
	static int equalStacks(int[] h1, int[] h2, int[] h3) {
		/*
		 * Write your code here.
		 */
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();
		int h1Weight = 0, h2Weight = 0, h3Weight = 0;
		for (int i = h1.length - 1; i >= 0; i--) {
			h1Weight += h1[i];
			stack1.push(h1Weight);
		}
		for (int i = h2.length - 1; i >= 0; i--) {
			h2Weight += h2[i];
			stack2.push(h2Weight);
		}
		for (int i = h3.length - 1; i >= 0; i--) {
			h3Weight += h3[i];
			stack3.push(h3Weight);
		}
		while (true) {
			if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty())
				return 0;
			h1Weight = stack1.peek();
			h2Weight = stack2.peek();
			h3Weight = stack3.peek();
			if (h1Weight == h2Weight && h2Weight == h3Weight)
				return h3Weight;
			if (h1Weight >= h2Weight && h1Weight >= h3Weight)
				stack1.pop();
			else if (h2Weight >= h1Weight && h2Weight >= h3Weight)
				stack2.pop();
			else if (h3Weight >= h1Weight && h3Weight >= stack1.peek())
				stack3.pop();
		}
	}

}
