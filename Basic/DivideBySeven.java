package Basic;

import java.math.BigInteger;
import java.util.Scanner;

public class DivideBySeven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++){
			
			BigInteger bi = new BigInteger(sc.nextBigInteger().toString());		
			BigInteger out = bi.mod(BigInteger.valueOf(7));
			System.out.println(out);
			
			
			
		}
		
		
		
		sc.close();

	}

}
