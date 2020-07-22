package JavaAssignment;
import java.util.Scanner;
public class Assignment1 {
	public static String backAround(String str) {
		char temp = str.charAt(str.length() - 1);
		return temp + str + temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String userInput;
		System.out.print("Enter a String : ");
		userInput = in.nextLine();
		
		String str1 = backAround(userInput);
		System.out.print(str1);
	}

}
