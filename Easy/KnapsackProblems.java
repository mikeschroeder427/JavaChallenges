package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KnapsackProblems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < tc; i++) {
			sc.nextLine();
			int w = Integer.parseInt(sc.nextLine());
			String[] v = sc.nextLine().split(" ");
			String[] ws = sc.nextLine().split(" ");
			
			List<String> vList = new ArrayList<String>();
			List<String> wList = new ArrayList<String>();
			
			for (int m = 0; m < ws.length; ++m) {
				if(Integer.parseInt(ws[m]) <= w){
					vList.add(v[m]);
					wList.add(ws[m]);
				}				
			}
			String[] vals = new String[vList.size()];
			vals = vList.toArray(vals);
			
			String[] weights = new String[wList.size()];
			weights = wList.toArray(weights);
			
			int maxVal = 0;
			
			for (int j = 0; j < Math.pow(2, weights.length); ++j) {
				String s = Integer.toBinaryString(j);
				
				for (int k = s.length(); k < weights.length; ++k)
					s = "0" + s;

				int sumWeight = 0, sumVal = 0;
				
				for (int k = s.length() - 1; k > -1; --k) {
					if (s.charAt(k) == '1') {
						
						sumWeight += Integer.parseInt(weights[k]);
						
						if (sumWeight > w)
							break;
						
						sumVal += Integer.parseInt(vals[k]);
					}
				}
					
				if (sumWeight <= w) {			
					if (sumVal > maxVal)
						maxVal = sumVal;				
				}
			}			
			System.out.println(maxVal);		
		}
		sc.close();
	}
	
}
