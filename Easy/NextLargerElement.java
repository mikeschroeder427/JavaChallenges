package Easy;

import java.util.Scanner;

public class NextLargerElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0;i < tc; i++) {
			int arrSize = Integer.parseInt(sc.nextLine());
			String[] split = sc.nextLine().split(" ");
			
			for (int j = 0; j< split.length; j++) {
				int val = Integer.parseInt(split[j]), nxtEle = -1;
				
				if (j != split.length - 1) {
					for (int k = j + 1; k < split.length; k++) {
						if (Integer.parseInt(split[k]) > val) {
							nxtEle = Integer.parseInt(split[k]);
							break;
						}
					}
				}
				

				
				System.out.print(nxtEle + " ");
				
			}
				System.out.println();
		}
		
		sc.close();

	}

}
