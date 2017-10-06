package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
	/// Technically this should be a quicksort.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < tc; i++) {
			int size = sc.nextInt();
			int[] arr = new int[size];
			
			for (int j = 0; j < size; j++)
				arr[j] = sc.nextInt();
						
			Arrays.sort(arr);
			System.out.println(arr[0]);
		}
		
		sc.close();

	}

}
