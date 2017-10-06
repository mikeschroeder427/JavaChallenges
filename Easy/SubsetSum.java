package Easy;

import java.util.Scanner;

public class SubsetSum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < tc; i++) {
			int sum = 0;
			sc.nextLine();
			
			String[] split = sc.nextLine().split(" ");
			
			for (int j = 0; j < split.length; j++) 
				sum += Integer.parseInt(split[j]);
			
			if (isSubset(sum, split))
				System.out.println("YES");
			else
				System.out.println("NO");
						
		}
		
		sc.close();

	}
	
	private static boolean isSubset(int sumTotal, String[] split) {
		
		if (sumTotal % 2 == 1)
			return false;
		
        int c = split.length;
        int sum = 0;
        
        for (int i = 0; i < Math.pow(2, c); i++) {
            sum = 0;
            for (int j = 0; j < c; j++) 
                if ((i & (1 << j)) > 0) {
                	
                	System.out.println(j);
                	
                    sum += Integer.parseInt(split[j]);                   
                    if (sum > sumTotal / 2)
                    	continue;
                }
            
            if (sum == sumTotal / 2)           
            	return true;
            
            //System.out.println(sum);
            
        }       
		return false;		
	}		
}
