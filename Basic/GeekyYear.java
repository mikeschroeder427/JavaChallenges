package Basic;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

public class GeekyYear {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < tc; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int counter = 0;
			
			for(int j = start; j <= end; j++) {
				Calendar c = Calendar.getInstance();
				c.set(Calendar.MONTH, Calendar.JANUARY);
				c.set(Calendar.DATE, 1);
				c.set(Calendar.YEAR, j); 
				
				if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
					counter++;
					System.out.println(c.get(Calendar.YEAR));
				}
			}
			
			System.out.println(counter);
			
		}
		sc.close();
	}

}
