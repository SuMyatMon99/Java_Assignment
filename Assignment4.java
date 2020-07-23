package JavaAssignment;
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String userInput;
		System.out.print("Enter a string : " );
		userInput = in.nextLine();
		
		int len = userInput.length();
		String ch="";
		if(len>=3) 
			ch = userInput.substring(0, 3);
			System.out.println(ch + userInput + ch);
		
	}

}
