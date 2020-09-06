package problems;

import java.io.IOException;
import java.util.Scanner;

public class ACMICPCTeam {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);
		String[] topic = new String[n];

		for (int i = 0; i < n; i++) {
			String topicItem = scanner.nextLine();
			topic[i] = topicItem;
		}

		int[] result = acmTeam(topic);

		for (int i = 0; i < result.length; i++) {
			System.out.println(String.valueOf(result[i]));
		}

		System.out.println();

		scanner.close();
	}

	static int[] acmTeam(String[] topic) {

		int noOfTopics = topic[0].length();
		int max = 0, current = 0, noOfTeams = 0;
		for (int i = 0; i < topic.length; i++) {
			String topicKnowledge = topic[i];
			for (int j = i + 1; j < topic.length; j++) {
				String secondKnowledge = topic[j];
				current = 0;
				for (int k = 0; k < noOfTopics; k++) {
					if (topicKnowledge.charAt(k) == '1' || secondKnowledge.charAt(k) == '1')
						current++;
				}
				if (current > max) {
					max = current;
					noOfTeams = 0;
				}
				if (current == max) {
					noOfTeams++;
				}
			}
		}
		return new int[] { max, noOfTeams };
	}

}
