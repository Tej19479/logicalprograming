package Array;

public class letterandnumbercount {
	public static void main(String[] args) {
		String s1 = "Manish Choudhary";
		int spacecount =0;
		int alphacount = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			{
				char ch = s1.charAt(i);
				if (ch>=65&& ch <=90 || ch>=97 && ch<=122) {
					alphacount ++;
				}
				
				else {
					spacecount++;
				}
			}
		}
		System.out.println("Alphabeta count = "+alphacount);
		System.out.println("space count = "+spacecount);

	}
	
}
