package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < tc; i++) {
			sc.nextLine();
			String[] split = sc.nextLine().split(" ");
			
			Arrays.sort(split);
			
			for(String s: split)
				System.out.print(s + " ");
			
			System.out.println();		
		}		
		sc.close();
	}
}