package JavaAssignment;
import java.util.Scanner;
public class TriangleFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rows;
		System.out.print("Enter the number of rows : " );
		rows = scanner.nextInt();
		
		int num = 1;
		for ( int i = 1; i <= rows; i++) {
			for ( int j = 1; j <= i; j++) {
				System.out.print(num + "\t");
				++num;
			}
			System.out.println();
		}
	}

}
