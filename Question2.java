import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought");
		int numPizza = input.nextInt();
		System.out.println("Enter the no of puffs bought");
		int numPuffs = input.nextInt();
		System.out.println("Enter the no of cool drinks");
		int numCoolDrinks = input.nextInt();
		
		int pizza = 100;
		int puffs = 20;
		int coldDrink = 10;
		double totalPrice = ((numPizza * pizza) + (numPuffs * puffs) + (numCoolDrinks * coldDrink));
		
		System.out.println("No of Pizzas " + numPizza);
		System.out.println("No of Puffs " + numPuffs);
		System.out.println("No of CoolDrinks " + numCoolDrinks);
		System.out.printf("Total Price is " + "%.2f", totalPrice);
	
		
		
	}

}
