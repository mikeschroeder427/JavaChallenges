package Easy;

import java.util.Scanner;

public class KeyPair {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < tc; i++) {
			String[] config = sc.nextLine().split(" ");
			int val = Integer.parseInt(config[1]);
			
			String[] split = sc.nextLine().split(" ");
			
			boolean isSum = false;
			
			for (int j = 0; j < split.length; j++) {
				int first = Integer.parseInt(split[j]);
				
				if (first > val)
					continue;
				
				for (int k = j + 1; k < split.length; k++) {
					int second = Integer.parseInt(split[k]);
					
					if (second > val)
						continue;
					
					if (first + second == val){
						isSum = true;
						break;
					}
				}				
			}
			
			if (isSum)
				System.out.println("Yes");
			else
				System.out.println("No");			
		}		
		sc.close();
	}
}
