package Business;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import models.Item;
import models.User;
import persistence.Persistence;

public class Logic {

	public void createNewItem(String itemName, int itemValue) {

		Persistence persistence = new Persistence();

		Item newItem = new Item(itemName, itemValue);

		persistence.createNewItem(newItem);

		System.out.println("Item successfully added");

	}

	public void createNewUser(String userName) {

		Persistence persistence = new Persistence();

		User newUser = new User(userName);

		persistence.createNewUser(newUser);

		System.out.println("User successfully added");

	}

	public void displayItems() {

		Persistence persistence = new Persistence();

		persistence.displayItems();

	}

	public void displayUsers() {
		Persistence persistence = new Persistence();

		persistence.displayUsers();

	}

	public int calculateCost(String itemID) {

		Persistence persistence = new Persistence();

		return persistence.calculateCost(itemID);

	}

	public int calculateTotalCost(int costOfItem, int amount) {
		return costOfItem * amount;
	}

	public void applyBulkDiscount(double cost) {
		if (cost > 10000) {
			cost = cost * 0.9;
			System.out.println("A discount of 10% has been applied");

		} else if (cost > 1000) {
			cost = cost * 0.95;
			System.out.println("A discount of 5% has been applied");
		}

	}

	public double applyDeliveryCharge(String deliveryChoice, double cost) {

		if (deliveryChoice.equals("Y") && cost > 2000) {

			cost = cost * 1.1;

		} else if (deliveryChoice.equals("Y")) {

			cost = cost * 1.05;

		}
		
		return cost;
	}
}
