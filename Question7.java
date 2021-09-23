import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i;
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int flag = 0;
		
		 if(num1 <=0 || num2<=0 || num1>=num2)
			 System.out.println("Invalid Input");
		 
		 else {
			 while(num1<=num2) {
				if(num1 == 2)
					System.out.println(num1 + "");
				else if(num1==1) {
					num1++;
					continue;
				}
				else {
					flag = 0;
					for(i = 2; i<=num1/2; i++) {
						if(num1%i == 0) {
							flag = 1;
							break;
						}
					}
					if(flag == 0)
						System.out.println(num1+ "");
					
				}
				num1++;
			 }
			
			}
				
		}

	}
