package Basic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LightBulbs {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int numTestCases = Integer.parseInt(sc.nextLine());
		
		for (int i =0; i < numTestCases; i++) {
			
			@SuppressWarnings("unused")
			int numBulbs = Integer.parseInt(sc.nextLine()), counter = 0;		
			ArrayList<String> bulbs = new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));
			
			for (int j = 0; j < bulbs.size(); j++){
				if (bulbs.get(j).contains("0")){
					bulbs = FlipSwitch(bulbs, j);
					counter++;
				}			
			}
			
			System.out.println(counter);
			
		}
		sc.close();
	}
	
	private static ArrayList<String> FlipSwitch (ArrayList<String> myList, int index){
		
		for (int i = index; i< myList.size();i++){
			if (myList.get(i).contains("0"))
				myList.set(i, "1");
			else
				myList.set(i, "0");
		}
		
		return myList;
	}
	
	
}
