package JavaAssignment;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		String operator;
		
		System.out.print("Enter first number : " );
		num1 = scanner.nextInt();
		
		System.out.print("Enter second number : " );
		num2 = scanner.nextInt();
		
		System.out.print("Enter operator : " );
		operator = scanner.next();
		
		int result = 0;
		switch(operator) {
			case "+" : result = num1 + num2;
				break;
			case "-" : result = num1 - num2;
				break;
			case "*" : result = num1 * num2;
				break;
			case "/" : result = num1 / num2;
				break;
			case "%" : result = num1 % num2;
				break;
			default :
				break;
		}
		System.out.println("The result is : " + result );
		scanner.close();
	}

}
