package JavaAssignment;
import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String userInput;
		System.out.print("Enter numbers : " );
		userInput = scanner.nextLine();
		
		int len = userInput.length();
		String str = "";
		int count = 0;
		for(int i = 0; i < len; i++) {
			if(count == 2) {
				str += ", "+userInput.charAt(i);
				count = 1;
			}
			else {
				str += userInput.charAt(i);
				count++;
			}
		}
		System.out.println("The result is : "+ str);
	}

}
