package Interoperability;

import java.util.Scanner;

import Business.Logic;

public class Input {

	public void start() {

		Logic logic = new Logic();

		boolean cont = true;

		while (cont) {

			System.out.println(
					"pick option 1 (Create New Item) 2 (Create New User) 3 (Display Items) 4 (Display Users) 5 (Calculate Cost)");

			Scanner sc1 = new Scanner(System.in);
			String selection = sc1.next();

			switch (selection) {

			case "1":

				System.out.println("Type the name of the item you which too add");
				String itemName = sc1.next();
				System.out.println("What is the value of the item (Integer)");
				int itemValue = sc1.nextInt();

				logic.createNewItem(itemName, itemValue);

				break;

			case "2":

				System.out.println("Type the name of the user you which too add");
				String userName = sc1.next();

				logic.createNewUser(userName);

				break;

			case "3":

				logic.displayItems();
				break;

			case "4":

				logic.displayUsers();
				break;

			case "5":

				boolean choice = true;

				double cost = 0;

				while (choice) {

					System.out.println("What item do you want to calculate cost for? (use its id)");

					String itemID = sc1.next();

					int costOfItem = logic.calculateCost(itemID);

					System.out.println("How many items are on the order?");

					int amount = sc1.nextInt();

					int totalCostForItem = logic.calculateTotalCost(costOfItem, amount);

					cost = cost + totalCostForItem;

					System.out.println("Do you need to add any more items to this delivery? (Y or N)");

					String userChoice = sc1.next();

					if (userChoice.equals("N")) {

						choice = false;

					}

				}

				logic.applyBulkDiscount(cost);

				System.out.println("Would you like to add speedy delivery? (Y or N)");

				String deliveryChoice = sc1.next();

				double finalCost = logic.applyDeliveryCharge(deliveryChoice, cost);

				System.out.println("The final cost for this order is " + finalCost);

				break;

			default:

				System.out.println("This is not a valid choice");
				break;

			}

			System.out.println("Do you want to continue working? (Y or N)");

			String contChoice = sc1.next();

			if (contChoice.equals("N")) {

				cont = false;

				System.out.println("Good-Bye!");

			}

		}

	}

}
