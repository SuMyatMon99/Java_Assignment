package JavaAssignment;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String userInput;
		System.out.print("Enter a string : " );
		userInput = scanner.nextLine();
		
		char ch[] = userInput.toCharArray(); 
	    for (int i = 0; i < userInput.length(); i++) { 
	 
	    	if (i == 0 && ch[i] != ' ' ||  ch[i] != ' ' && ch[i - 1] == ' ') { 
	    
	    		if (ch[i] >= 'a' && ch[i] <= 'z') { 
	 
	    			ch[i] = (char)(ch[i] - 'a' + 'A'); 
	                 
	    		} 
	    		else if (ch[i] >= 'A' && ch[i] <= 'Z')  
	            	   
	    			ch[i] = (char)(ch[i] + 'a' - 'A');             
	        	} 
	     
	     } 
	       String str = new String(ch); 
	       System.out.print(str);
	}

}
