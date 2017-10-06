package Basic;
import java.util.*;

public class ToggleBits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTests = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < numOfTests; i++) {
			String[] myArr = scanner.nextLine().split(" ");
			
			String bin = Integer.toBinaryString(Integer.parseInt(myArr[0]));
			int start = bin.length() - Integer.parseInt(myArr[2]);
			int end = bin.length() - Integer.parseInt(myArr[1]);
			
			String tempBin = "";
			String currentChar = "";
			
			for (int j =0; j< bin.length(); j++){
				if (j >= start && j <= end) {
					
					if (bin.charAt(j) == '0')
						currentChar = "1";
					else
						currentChar = "0";						
				}
				else
					currentChar = String.valueOf(bin.charAt(j));
				
				tempBin += currentChar;
				
			}		
			System.out.println(Integer.parseInt(tempBin, 2));			
		}
		scanner.close();
	}

}
