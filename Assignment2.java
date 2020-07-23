package JavaAssignment;
import java.util.Scanner;
public class Assignment2 {
	public static String removeChar(String str, Integer n) {
		String first = str.substring(0, n);
		String second = str.substring(n+1);
		return first + second;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String userInput;
		System.out.print("Enter a string : ");
		userInput = in.nextLine();
		
		Integer inputIndex;
		System.out.print("Enter an index : ");
		inputIndex = in.nextInt();
		
		String str1 = removeChar(userInput, inputIndex);
		System.out.println(str1);
	}

}
