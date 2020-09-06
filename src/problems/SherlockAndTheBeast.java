/**
 * 
 */
package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * @author PRATAP
 *
 */
public class SherlockAndTheBeast {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bufferedReader.readLine().trim());
		IntStream.range(0, t).forEach(tItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());
				decentNumber(n);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
	}

	// Complete the decentNumber function below.
	static void decentNumber(int n) {
		StringBuilder result = new StringBuilder();
		int noOfThrees = 0, noOfFives = 0;
		for (int i = n; i >= 0; i -= 3) {
			if ((i % 3 == 0) && ((n - i) % 5 == 0)) {
				noOfFives = i;
				noOfThrees = n - i;
			}
			if ((i % 5 == 0) && ((n - i) % 3 == 0)) {
				noOfThrees = i;
				noOfFives = n - i;
			}
		}
		if (noOfFives > 0 || noOfThrees > 0) {
			while (noOfFives > 0) {
				result.append("5");
				noOfFives--;
			}
			while (noOfThrees > 0) {
				result.append("3");
				noOfThrees--;
			}
		} else {
			result.append("-1");
		}
		System.out.println(result);
	}

}
