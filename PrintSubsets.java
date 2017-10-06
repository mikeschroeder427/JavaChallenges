import java.util.Scanner;

public class PrintSubsets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] split = sc.nextLine().split(" ");
		
		printSubsets(split);
		

	}

    static void printSubsets(String set[])
    {
        int n = set.length;
        int counter =0;

        // Run a loop for printing all 2^n
        // subsets one by obe
        for (int i = 0; i < Math.pow(2, n); i++)
        {
            int sum = 0;
            System.out.print("{ ");
 
            // Print current subset
            for (int j = 0; j < n; j++){
             	
                if ((i & (1 << j)) > 0) {
                	sum += Integer.parseInt(set[j]);
                    System.out.print(set[j] + " ");
                }
            }
                 
            System.out.println("} : " + sum);
        }
    }
	

}
