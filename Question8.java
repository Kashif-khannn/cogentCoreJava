import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String reverse = "";
		String orig = keyboard.nextLine();
		int len = orig.length();
		
		for(int j = len -1 ; j>=0; j--) {
			reverse = reverse + orig.charAt(j);
		
			
		}
		if(orig.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		

	}

}
