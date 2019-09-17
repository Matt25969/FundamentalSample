package Main;
import java.util.Scanner;

public class Logic {

	public void createNewItem(Scanner sc1) {

		System.out.println("Type the name of the item you which too add");
		String itemName = sc1.next();
		System.out.println("What is the value of the item (Integer)");
		int itemValue = sc1.nextInt();

		Item newItem = new Item(itemName, itemValue);

		// save the item
		
		//4o1cLtNzIE7opwec

		System.out.println("Item successfully added");

	}
	
	public void createNewUser(Scanner sc1) {

		System.out.println("Type the name of the user you which too add");
		String userName = sc1.next();

		User newUser = new User(userName);

		// save the user

		System.out.println("User successfully added");

	}

	public void displayItems(Scanner sc1) {

		// get all from the database

	}

	public void calculateCost(Scanner sc1) {

		boolean choice = true;

		double cost = 0;

		while (choice) {

			System.out.println("What item do you want to calculate cost for? (use its id)");

			String itemName = sc1.next();
			// get item via id

			System.out.println("How many items are on the order?");

			int amount = sc1.nextInt();

			// arithmetic
			// set cost

			if (cost > 10000) {
				cost = cost * 0.9;

			} else if (cost > 1000) {
				cost = cost * 0.95;
			}

			System.out.println("Do you need to add any more items to this delivery? (Y or N)");

			String userChoice = sc1.next();

			if (userChoice.equals("N")) {

				choice = false;

			}

		}

		System.out.println("Would you like to add speedy delivery? (Y or N)");

		String deliveryChoice = sc1.next();

		if (deliveryChoice.equals("Y") && cost > 2000) {

			cost = cost * 1.1;

		} else if (deliveryChoice.equals("Y")) {

			cost = cost * 1.05;

		}

		System.out.println(cost);

	}

}
