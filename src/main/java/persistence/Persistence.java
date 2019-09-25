package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Interoperability.Input;
import models.Item;
import models.User;

public class Persistence {

	public Connection createConnection() {

		System.out.println("Connecting to database...");

		String jdbcUrl = "";
		String databaseName = "";
		String username = "";
		String password = "";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcUrl + databaseName, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

	public void createNewItem(Item item) {

		Connection connection = this.createConnection();

		try (Statement statement = connection.createStatement()) {

			statement.executeUpdate(
					"INSERT INTO Item (name, value)" + "VALUES ( '" + item.getName() + "', " + item.getValue() + ")");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createNewUser(User user) {

		Connection connection = this.createConnection();

		try (Statement statement = connection.createStatement()) {

			statement.executeUpdate("INSERT INTO User (name)" + "VALUES ( '" + user.getName() + "')");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void displayItems() {

		Connection connection = this.createConnection();

		try (Statement statement = connection.createStatement()) {

			ResultSet rs = statement.executeQuery("SELECT * FROM Item");

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int value = rs.getInt("value");
				System.out.println("ID: " + id + ", name: " + name + ", value: " + value);
			}
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void displayUsers() {

		Connection connection = this.createConnection();

		try (Statement statement = connection.createStatement()) {

			ResultSet rs = statement.executeQuery("SELECT * FROM User");

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println("ID: " + id + ", name: " + name);
			}
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int calculateCost(String itemID) {

		Connection connection = this.createConnection();

		int retVal = -1;

		try (Statement statement = connection.createStatement()) {

			ResultSet rs = statement.executeQuery("SELECT * FROM Item WHERE id = " + itemID);

			while (rs.next()) {
				retVal = rs.getInt("value");
			}
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return retVal;

	}

}
