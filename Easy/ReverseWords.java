package Easy;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
				
		for (int i = 0; i < tc; i++) {
			String[] split = sc.nextLine().split("\\.");
			
			for (int j = split.length - 1; j > - 1; j--) {
				System.out.print(split[j]);
				
				if (j != 0)
					System.out.print(".");
			}
			System.out.println();
		}
		sc.close();
	}
}