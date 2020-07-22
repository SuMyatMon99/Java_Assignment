package JavaAssignment;
import java.util.Scanner;
import java.util.Arrays;
public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many numbers you want to enter?");
		Scanner in = new Scanner(System.in);
		int userInput = in.nextInt();
		
		int [] arr = new int [userInput];
		int total = 0;
		
		for (int i = 0 ; i<arr.length; i++) {
			System.out.print("Enter number " + (i+1) + ":");
			arr[i] = in.nextInt();
		}
		in.close();
		
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }


        
        double avg = total / arr.length;
        
        System.out.println("Average value is : " + avg );
		
        Arrays.sort(arr);
        System.out.println("Minimum values are : " + arr[0] + ", " + arr[1]);
        System.out.println("Maximum values are : " + arr[arr.length-2] + ", " + arr[arr.length-1]);
	}

}
