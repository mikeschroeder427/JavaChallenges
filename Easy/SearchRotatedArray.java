package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchRotatedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for ( int i = 0 ;i < tc; i++) {
			int arrLength = Integer.parseInt(sc.nextLine());
			String[] myArr = sc.nextLine().split(" ");
			int val = Integer.parseInt(sc.nextLine());
			
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
					
			for (int j = 0; j < myArr.length; j++) 
				map.put(Integer.parseInt(myArr[j]), j);
			
			System.out.println(map.getOrDefault(val, -1));
				
		}
		sc.close();
	}
}