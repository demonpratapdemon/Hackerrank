/**
 * 
 */
package problems;

import java.util.Scanner;

/**
 * @author PRATAP
 *
 */
public class GoodlandElectricity {

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

		boolean visited[] = new boolean[n];
		boolean powerPlantArr[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int result = pylons(k, arr, visited, powerPlantArr);
		System.out.println(result);
	}

	private static int pylons(int k, int[] arr, boolean[] visited, boolean[] powerPlantArr) {
		// TODO Auto-generated method stub

		int powerPlants = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				for (int j = i - k + 1; j < i && j >= 0; j++) {
					if (arr[j] == 1 && visited[j] && powerPlantArr[j]) {
						visited[i] = true;
						break;
					}
					if (arr[j] == 1 && !visited[j]) {
						if (!visited[j])
							powerPlants++;
						visited = updateVisitedArray(visited, j, k);
						powerPlantArr = updatePowerArr(powerPlantArr, j);
					}
				}
				for (int j = i + k - 1; j > i && j < arr.length; j--) {
					if (arr[j] == 1 && visited[j] && powerPlantArr[j]) {
						visited[i] = true;
						break;
					}
					if (arr[j] == 1 && !visited[j]) {
						if (!visited[j])
							powerPlants++;
						visited = updateVisitedArray(visited, j, k);
						powerPlantArr = updatePowerArr(powerPlantArr, j);
					}
				}
			}
			if(arr[i]==1 && !visited[i]) {
				powerPlantArr[i]=true;
				powerPlants++;
				visited[i] = true;
			}
		}
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				powerPlants = -1;
				break;
			}
		}
		return powerPlants;
	}

	private static boolean[] updatePowerArr(boolean[] powerPlantArr, int j) {
		// TODO Auto-generated method stub
		powerPlantArr[j] = true;
		return powerPlantArr;
	}

	private static boolean[] updateVisitedArray(boolean[] visited, int pos, int k) {
		// TODO Auto-generated method stub

		visited[pos] = true;
		k -= 1;
		while (k >= 0) {
			if (pos - k <= visited.length && pos - k >= 0 && !visited[pos - k]) {
				visited[pos - k] = true;
			}
			if (pos + k <= visited.length && !visited[pos + k]) {
				visited[pos + k] = true;
			}
			k--;
		}
		return visited;
	}

}
