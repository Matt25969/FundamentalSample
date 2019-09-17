import java.util.Scanner;

public class Input {

	public void start() {

		Logic logic = new Logic();

		boolean cont = true;

		while (cont) {

			System.out.println("pick option 1 2 or 3");

			Scanner sc1 = new Scanner(System.in);
			String choice = sc1.next();

			switch (choice) {

			case "1":

				logic.createNewItem(sc1);
				break;
				
			case "2":

				logic.createNewUser(sc1);
				break;

			case "3":

				logic.displayItems(sc1);
				break;

			case "4":

				logic.calculateCost(sc1);
				break;

			default:

				System.out.println("This is not a valid choice");
				break;

			}

			System.out.println("Do you want to continue working? (Y or N)");

			String contChoice = sc1.next();

			if (contChoice.equals("N")) {

				cont = false;

			}

		}

	}

}
