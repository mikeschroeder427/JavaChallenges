package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParanthesisChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());

		for (int i = 0; i< tc; i++){
			String input = sc.nextLine();
			List<String> myList = new ArrayList<String>();
			boolean isValid = true;
			
			for (int j = 0; j < input.length(); j++) {
				String currentChar = String.valueOf(input.charAt(j));
				
				if (("{([").contains(currentChar)) {					
					switch (currentChar){
						case "{": 
							myList.add("}");
							break;
						case "(": 
							myList.add(")");
							break;
						case "[": 
							myList.add("]");
							break;
					}
					continue;
				}
				
				if (("})]").contains(currentChar) && j > 0) {
					
					if(myList.size() > 0 && myList.get(myList.size() - 1).equals(currentChar)) {
						myList.remove(myList.size() - 1);
						continue;						
					}
					else 
					{
						isValid = false;
						break;
					}					
				}		
				
				isValid = false;
				break;
			}
			
			if (isValid && myList.size() == 0)
				System.out.println("balanced");
			else
				System.out.println("not balanced");
		}
		
		sc.close();
	}

}
