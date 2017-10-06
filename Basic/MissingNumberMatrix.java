package Basic;

import java.util.Scanner;

public class MissingNumberMatrix {

	private static int zeroRow = 0;
	private static int zeroCol = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = Integer.parseInt(sc.nextLine());
		
		for (int i =0; i < tc; i++) {
			int mSize = sc.nextInt();
			
			if (mSize == 1){
				if (sc.nextInt() == 0)
					System.out.println(1);
				else
					System.out.println(-1);
				continue;
			}
			
			long[][] myArr = FillMatrix(mSize, sc);		
			long maxVal = GetMaxVal(myArr);
			long proposedVal = GetProposedVal(myArr, maxVal);
			
			if (proposedVal == 0){
				System.out.println(-1);
				continue;
			}
			
			myArr[zeroRow][zeroCol] =  proposedVal;
			
			if (CheckAllValues(myArr, maxVal)) 
				System.out.println(proposedVal);
			else
				System.out.println(-1);
		}				
		sc.close();
	}

	private static long[][] FillMatrix(int mSize, Scanner sc) {
		
		long[][] tmpArr = new long[mSize][mSize];
		
		for (int i =0; i < mSize; i++) 		
			for (int j =0; j < mSize; j++) {
				int num = sc.nextInt();
				tmpArr[i][j] = num;
				
				if (num == 0){
					zeroRow = i;
					zeroCol = j;
				}									
			}
		return tmpArr;		
	}
	
	private static long GetMaxVal(long[][] myArr) {
		int rowIndex = 0;
		long maxVal = 0;
		
		if (zeroRow == 0)
			rowIndex = 1;
			
		for (int i =0; i < myArr[rowIndex].length; i++)
			maxVal += myArr[rowIndex][i];
			
		return maxVal;
	}
	
	private static long GetProposedVal(long[][] myArr, long maxVal) {	
		long rowSum = 0;
		
		for (int i = 0; i < myArr[zeroRow].length; i++)  
			rowSum += myArr[zeroRow][i];
					
		return maxVal - rowSum;
	}
	
	private static boolean CheckAllValues(long[][] myArr, long maxVal) {
		long zeroRowVal = 0;
		long zeroColVal = 0;
		long dFirstVal = 0;
		long dLastVal = 0;
		
		for (int i =0; i < myArr.length; i++){
		
			for (int j = 0; j < myArr[zeroRow].length; j++)
				zeroRowVal += myArr[i][j];
			
			if (zeroRowVal != maxVal)
				return false;
			
			zeroRowVal = 0;
		}
		///
		for (int i = 0; i < myArr[zeroRow].length; i++)
			zeroColVal += myArr[i][zeroCol];
		
		if (zeroColVal != maxVal)
			return false;
		///
		for (int i = 0; i < myArr[zeroRow].length; i++)
			dFirstVal += myArr[i][i];
		
		if (dFirstVal != maxVal)
			return false;
		///
		for (int i = 0; i < myArr[zeroRow].length; i++){
			dLastVal += myArr[i][(myArr[zeroRow].length - 1) - i];
		}
		if (dLastVal != maxVal)
			return false;
				
		return true;	
	}

}