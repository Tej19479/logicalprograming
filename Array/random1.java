package Array;

import java.util.Random;

public class random1 {
public static void main(String[] args) {
	Random  tej= new Random();
	long start = System.currentTimeMillis();
	int evencount = 0;
	int oddcount =0;
	long end = System.currentTimeMillis();

	int tej1 =tej.nextInt();
	System.out.println(tej1);
	while (tej1>=0) {
		int rem = tej1%10;		
		if (rem%2==0) {
			evencount++;	
		}
		else {
			oddcount++ ;
			end++;
			/*long end = System.currentTimeMillis();*/
		}
		
	}
	
	 System.out.println(oddcount); 
	 System.out.println("Total time taken"+(start-end));
}
}
