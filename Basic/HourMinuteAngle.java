package Basic;

import java.util.Scanner;

public class HourMinuteAngle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++){
			double hour = sc.nextDouble();
			double min = sc.nextDouble();
			
			double hourHandLocation = GetHourLocation(hour, min);
			double minHandLocation = GetMinLocation(min);
			double outputVal = Math.abs(hourHandLocation - minHandLocation);
				
			if (outputVal > 180)
				outputVal = 180 - (outputVal - 180);
			
			System.out.println((int)outputVal);			
		}		
		sc.close();		
	}
	
	private static double GetHourLocation(double hour, double min) {
		if ((hour % 12) == 0)
			hour = 0;
		
		if ((min % 60) == 0)
			min = 0;
		
		return (30 * hour) + (min / 60) * 30;
	}
	
	private static double GetMinLocation(double min){
		return (min * 6);
	}

}
