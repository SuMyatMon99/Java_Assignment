package JavaAssignment;
import java.util.Scanner;
public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int userInput;
		System.out.print("Enter a number : ");
		userInput = in.nextInt();
		int fact=1;
		for(int i = 1; i<=userInput; i++) {
			fact *=i;
		}
		System.out.println("Factorial number of " + userInput + " is " + fact);
	}

}
