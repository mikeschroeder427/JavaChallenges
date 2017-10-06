package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColumnNameFromNumber {
	
	final static String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int i =0; i < tc; i++) {
			long num = sc.nextLong();
			List<String> lst = new ArrayList<String>();
			int q = (int) Math.floor(num / 26);
			int r = (int) Math.floor(num % 26);
			
			if (q > 0)
			{
				while (q > 1) {
					
					if (r == 0)
						lst.add(letters[25]);
					else
						lst.add(letters[r - 1]);
					
					num = q;
					
					q = (int) Math.floor(num / 26);
					r = (int) Math.floor(num % 26);				
				}
				
				if (q == 1 && r == 0)
				
				if (r == 0)
					lst.add(letters[25]);
				else 
					lst.add(letters[r - 1]);
			}
			else {
				System.out.println(letters[r - 1]);
				continue;
			}
			
			for (int j = lst.size() - 1; j >= 0; --j)
				System.out.print(lst.get(j));
			
			System.out.println();
			
		}
		
		sc.close();

	}
}
