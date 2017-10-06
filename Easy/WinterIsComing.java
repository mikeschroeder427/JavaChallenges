package Easy;

import java.util.Scanner;

public class WinterIsComing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < tc; i++){
			int counter = Integer.parseInt(sc.nextLine().split(" ")[1]);
			int kills = 0;
			boolean isValid = true;
			String[] arr = sc.nextLine().split(" ");
			
			for (int k = 0; k < arr.length; k++) {
				
				if(isPrime(Integer.parseInt(arr[k]))) {
					kills = 0;
					continue;
				}
				else {				
					if (kills < counter){
						kills++;	
						
						if (kills == counter){
							isValid = false;
							break;
						}
					}			
				}		
			}
			
			if (isValid)
				System.out.println(1);
			else
				System.out.println(0);
			
		}
		
		sc.close();
	}

	private static boolean isPrime(int num) {
		if (num <= 1)
			return false;
			
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0 || num == 1)
				return false;
		}
		
		return true;
	}
}
