package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorsLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i =0;i < tc;i++) {
			sc.nextLine();
			String[] arr = sc.nextLine().split(" ");
			List<Integer> myList = new ArrayList<Integer>();
			
			for (int j = 0;j < arr.length; j++) 			
				if (isPrime(Integer.parseInt(arr[j]))) 
					myList.add(Integer.parseInt(arr[j]));		
			
			
			Collections.sort(myList);
			
			for (int j = 0; j < myList.size(); j++) 
				System.out.print(myList.get(j) + " ");
						
			System.out.println(sumIt(arr));
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
	
	private static <T> long sumIt(T[] arr) {
		long sum = 0;
		
		for (int i = 0; i < arr.length; i++) 
			sum += Integer.parseInt((String) arr[i]);
		
		return sum;
	}
	
}
