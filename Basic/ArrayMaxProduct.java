package Basic;
import java.util.*;
import java.math.BigInteger;

public class ArrayMaxProduct {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int numOfTests = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i< numOfTests; i++){
			String arrayConfig = sc.nextLine();		
			String[] myArr = sc.nextLine().split(" ");
			Integer[] intArr = new Integer[myArr.length];	
			
			int arraySize = Integer.parseInt(arrayConfig.split(" ")[0]);
			int numOfProducts = Integer.parseInt(arrayConfig.split(" ")[1]);
			
			for (int j = 0;j < myArr.length; j++)
				intArr[j] = Integer.parseInt(myArr[j]);
							
			findMaxProduct(arraySize, numOfProducts, intArr);
		}
		
		sc.close();
	}
	
	private static void findMaxProduct(int arraySize, int numOfProducts, Integer[] nums){	
		BigInteger total = new BigInteger("1");
		
		List<Integer> myList = Arrays.asList((nums));		
		myList.sort(null);
		
		for (int i = myList.size() - numOfProducts; i < myList.size(); i++){			
			total = total.multiply(BigInteger.valueOf(myList.get(i)));
		}
		
		System.out.println(total.toString());
		
	}
	
}
