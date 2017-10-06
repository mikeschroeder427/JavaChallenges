package Easy;

import java.util.Scanner;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < tc; i++) {
			
			String[] config = sc.nextLine().split(" ");
			String[] myArr = sc.nextLine().split(" ");
			
			int val = Integer.parseInt(config[1]);			
			int start = 0, end = 0, total = 0;		
			boolean isSum = false;
			
			for (int j = 0; j < myArr.length; j++) {
				start = j;
				total = Integer.parseInt(myArr[j]);
				
				if (Integer.parseInt(myArr[j]) > val) 
					continue;
								
				if (Integer.parseInt(myArr[j]) == val) {
					end = j;
					isSum = true;
					System.out.println((start + 1) + " " + (end + 1));
					break;
				}
			
				for (int k = j + 1; k < myArr.length; k++) {
					end = k;
					total += Integer.parseInt(myArr[k]);
					
					if (total == val) {
						System.out.println((start + 1) + " " + (end + 1));
						isSum = true;
						break;
					}					
				}
				
				if (isSum)
					break;
				
				total = 0;
			}
			
			if (!isSum)
				System.out.println(-1);
			
		}		
		sc.close();
	}
}
