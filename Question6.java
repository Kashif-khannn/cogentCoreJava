import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the month: ");
		int month = inp.nextInt();
		
		
		if(month < 1 || month > 12) {
			System.out.println("Invalid Month");
		} else if(month >=3 && month <=5) {
			System.out.println("Season : Spring");
		} else if(month >=6 && month <=8) {
			System.out.println("Season: Summer");
		} else if(month >=9 && month <=11) {
			System.out.println("Season: Autumn");
		} else {
			System.out.println("Season: Winter");
		}
		

	}

}
