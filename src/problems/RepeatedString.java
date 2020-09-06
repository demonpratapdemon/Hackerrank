package problems;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);
		System.out.println(result);
		scanner.close();
	}

	static long repeatedString(String s, long n) {

		if (s.length() == 1 && s.equalsIgnoreCase("a"))
			return n;
		else if (s.length() == 1 && !s.equalsIgnoreCase("a"))
			return 0;
		long count = countA(s);
		if (count == 0)
			return 0;
		long times = (n / Long.parseLong(String.valueOf(s.length())));
		Long remainingLength = n - times * s.length();
		count = count * times + countA(s.substring(0, remainingLength.intValue()));
		return count;
	}

	static long countA(String s) {

		long count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
				count++;
		}
		return count;
	}

}
