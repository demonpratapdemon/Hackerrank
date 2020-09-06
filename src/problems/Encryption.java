package problems;

import java.util.Scanner;

public class Encryption {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = scanner.nextLine();

		String result = encryption(s);

		System.out.println(result);
		
		scanner.close();
	}

	static String encryption(String s) {

		s = s.replace("\\s", "");
		Double row = Math.floor(Math.sqrt(Double.parseDouble(String.valueOf(s.length()))));
		Double col = Math.ceil(Math.sqrt(Double.parseDouble(String.valueOf(s.length()))));
		while (row * col < s.length())
			row++;
		String[][] arr = new String[row.intValue()][col.intValue()];
		int k = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (k < s.length()) {
					arr[i][j] = String.valueOf(s.charAt(k));
					k++;
				} else {
					arr[i][j] = String.valueOf(" ");
				}
			}
		}
		String finalResult = "";
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if (arr[j][i] != " ")
					finalResult += arr[j][i];
			}
			finalResult += " ";
		}
		return finalResult;
	}

}
