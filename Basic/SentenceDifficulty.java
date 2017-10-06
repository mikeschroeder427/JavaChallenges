package Basic;
import java.util.Scanner;

public class SentenceDifficulty {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalCases = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < totalCases; i++){
			int total = 0;
			int hard = 0;
			int easy = 0;
			
			String[] split = sc.nextLine().split(" ");
			
			for (String word : split) {
				Boolean isEasy = true;
				int hardCounter = 0;
				int numOfCons = 0;			
				
				for (int j =0; j < word.length(); j++) {
					
					if("AEIOU".contains(String.valueOf(word.charAt(j)).toUpperCase()))
						hardCounter = 0;
					else
					{
						numOfCons++;
						hardCounter++;
					}
					
					if (hardCounter == 4 || numOfCons > word.length() / 2){
						hard++;
						isEasy = false;
						break;					
					}
								
				
				}
				
				if (isEasy)
					easy++;			
			}
			
			total = (5 * hard) + (3 * easy);
			System.out.println(total);
			
		}
		
		sc.close();
	}

}
