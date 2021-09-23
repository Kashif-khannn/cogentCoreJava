import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		
		 int salary;
	        Scanner scn = new Scanner(System.in);
	        System.out.println("Enter the salary");
	        salary = scn.nextInt();
	        
	        System.out.println("Enter the Performance rating rating");
	        double rating = scn.nextDouble();
	        
	        if((rating>0 && rating<=5)&&salary>0)
	        {
	            if(rating>=1 && rating<=3)
	            {
	                salary = salary+((salary*10)/100);
	            }
	            else if(rating>=3.1 && rating<=4)
	            {
	                salary = salary+((salary*25)/100);
	            }
	            else if(rating>=4.1 && rating<=5)
	            {
	                salary = salary +((salary*30)/100);
	            }
	            System.out.println(salary);
	        }
	        else
	        {
	            System.out.println("Invalid Input");
	        }

	}
}


