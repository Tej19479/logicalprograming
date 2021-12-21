package Array;

public class arrayconitingofletter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Golusingh19479@gmail.com";
		int numericcount =0;
		int specialcount =0;
		int alphanumericcount = 0;
		for (int i = 0; i < s1.length(); i++) {
			{
				char ch = s1.charAt(i);
				if (ch>=65&& ch <=90 || ch>=97 && ch<=122) {
					alphanumericcount ++;
				}
				else if (ch>=48 && ch<=57) {
					numericcount++;
					
				}
				else {
					specialcount++;
				}
			}
		}
		
		System.out.println("Aplha beta is="+alphanumericcount);
		System.out.println("numeric beta is="+numericcount);
		System.out.println("Specialcount ="+numericcount);

	}
	
}
