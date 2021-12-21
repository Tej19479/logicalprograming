package Array;

public class Hexadecimal {
	public static String decToHexa (int num) {
		String out = "";
		String str = "0123456789ABCDEF";
		while (num!=0) {
			
			int rem = num%16;
			out =str.charAt(rem)+out;
			num = num/16;
		}
		return out;
		
	}
	
	public static void main(String[] args) {
		String res = decToHexa(68);
		System.out.println(res);
		
	}

}
