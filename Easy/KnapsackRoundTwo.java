package Easy;

import java.util.Scanner;

public class KnapsackRoundTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < tc; i++) {
			sc.nextLine();
			int w = Integer.parseInt(sc.nextLine());
			String[] v = sc.nextLine().split(" ");
			String[] ws = sc.nextLine().split(" ");
	
			int[][] arr = new int[ws.length + 1][w + 1];
			
			for (int j =0; j < w; ++j)
				arr[0][j] = 0;
						
			for (int j = 0; j <= ws.length; ++j)
				arr[j][0] = 0;
			
			for (int j = 1; j <= ws.length; ++j) {
				for (int k = 1; k <= w; k++) {
					
					if (Integer.parseInt(ws[j -1]) <= k) 
						arr[j][k] = Math.max(Integer.parseInt(v[j-1]) + arr[j-1][k - Integer.parseInt(ws[j-1])], arr[j-1][k]);
					else
						arr[j][k] = arr[j-1][k];
				}
			}
			System.out.println(arr[arr.length - 1][arr[0].length - 1]);
		}
		sc.close();
	}
}