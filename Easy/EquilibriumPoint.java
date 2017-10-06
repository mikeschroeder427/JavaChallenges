package Easy;

import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < tc; i++) {

			sc.nextLine();
			String[] arr = sc.nextLine().split(" ");

			if (arr.length == 1) {
				System.out.println(1);
				continue;
			}

			int sum = getSum(arr);
			int counter = 0;

			for (int j = 0; j < arr.length; j++) {
				counter += Integer.parseInt(arr[j]);

				if (counter == (sum - counter - Integer.parseInt(arr[j + 1]))) {
					System.out.println(j + 2);
					break;
				}

				if (counter >= sum / 2 || j == arr.length - 2) {
					System.out.println(-1);
					break;
				}
			}
		}
		sc.close();
	}

	private static int getSum(String[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++)
			num += Integer.parseInt(arr[i]);

		return num;
	}

}
