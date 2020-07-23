package JavaAssignment;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String userInput1;
		String userInput2;
		String operator;
		
		System.out.print("Enter first number : " );
		userInput1 = scanner.nextLine();
		int num1=Integer.parseInt(userInput1);
		
		System.out.print("Enter second number : " );
		userInput2 = scanner.nextLine();
		int num2=Integer.parseInt(userInput2);
		
		System.out.print("Enter operator : " );
		operator = scanner.nextLine();
		char op = operator.charAt(0);
		
		switch(op) {
			case '+' : System.out.println("The result is : " + (num1 + num2));
				break;
			case '-' : System.out.println("The result is : " + (num1 - num2));
				break;
			case '*' : System.out.println("The result is : " + (num1 * num2));
				break;
			case '/' : System.out.println("The result is : " + (num1 / num2));
				break;
			case '%' : System.out.println("The result is : " + (num1 % num2));
				break;
			default :
				break;
		}
	}

}
