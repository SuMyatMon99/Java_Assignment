package JavaAssignment;
import java.util.Scanner;
public class Assignment3 {
	
	public static String exchangeChar(String str) {
		int len = str.length();
		
		if(len <1) {
			return str;
		}
		else {
			char first = str.charAt(0);
			char last = str.charAt(len-1);
			str = last + str.substring(1, len-1) + first;
			return str;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String userInput;
		System.out.print("Enter a string : " );
		userInput = in.nextLine();
		
		String str1= exchangeChar(userInput);
		System.out.println(str1);
	}

}
