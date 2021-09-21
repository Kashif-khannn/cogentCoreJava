import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		boolean isInt = kb.hasNextInt();
		if (isInt == false) {
			System.out.println("Invalid Input");
			return;
		}
		double gas = kb.nextDouble();
		if(gas < 0.00) {
			System.out.println("Invalid Input");
		}
		
		System.out.println("Enter the distance covered");
		if (isInt == false) {
			System.out.println("Invalid Input");
			return;
		}
		double distance = kb.nextDouble();
		if(distance < 0) {
			System.out.println("Invalid Input");
		}
		
		
		
		double fuelConsumed = ((gas/distance)*100);
		double miles = distance*0.6214;
		double gasInGallons = gas/5.284;
		double milesByGallons = miles/5.284;
		
		System.out.println("Liters/100KM");
		System.out.printf("%.2f\n",fuelConsumed);
		System.out.println("Miles/gallons");
		System.out.printf("%.2f\n", milesByGallons);

	}

}
