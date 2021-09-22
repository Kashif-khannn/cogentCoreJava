import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter no of students placed in CSE: ");
		int stu_CSE = inp.nextInt();
		System.out.println("Enter no of students placed in ECE: ");
		int stu_ECE = inp.nextInt();
		System.out.println("Enter no of students placed in MECH: ");
		int stu_MECH = inp.nextInt();
		
		
		
		if(stu_CSE < 0 || stu_ECE < 0 || stu_MECH < 0) {
			System.out.println("Invalid Input");
			
		} else {
			if(stu_CSE == stu_ECE && stu_ECE == stu_MECH && stu_MECH == stu_CSE ) {
				System.out.println("None of the department has got the highest placement");
			}
			else if(stu_CSE == stu_ECE && stu_CSE > stu_MECH) {
				System.out.println("Highest Placement");
				System.out.println("CSE");
				System.out.println("ECE");
			}
			else if(stu_CSE == stu_MECH && stu_CSE > stu_ECE) {
				System.out.println("Highest Placement");
				System.out.println("CSE");
				System.out.println("MECH");
			}
			else if(stu_ECE == stu_MECH && stu_ECE > stu_CSE) {
				System.out.println("Highest Placement");
				System.out.println("ECE");
				System.out.println("MECH");
			}
			else if(stu_CSE > stu_ECE && stu_CSE > stu_MECH) {
				System.out.println("Highest Placement");
				System.out.println("CSE");
			}
			else if(stu_ECE > stu_CSE && stu_ECE > stu_MECH) {
				System.out.println("Highest Placement");
				System.out.println("ECE");
		}
			else  {
				System.out.println("Highest Placement");
				System.out.println("MECH");
		
		

	}
		}
	}
}


