package Easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < tc; i++) {
			int arrSize = Integer.parseInt(sc.nextLine());
			String[] split = sc.nextLine().split(" ");
			
			Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
			
			for (int j = 0; j < split.length; j++) 
				mp.put(Integer.parseInt(split[j]), mp.getOrDefault(Integer.parseInt(split[j]), 0) + 1 );
			
			int maxVal = Collections.max(mp.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
			int maj = mp.get(maxVal);
			
			if (maj > (arrSize / 2))
				System.out.println(maxVal);
			else
				System.out.println("NO Majority Element");
			
		}
		
		sc.close();

	}

}
