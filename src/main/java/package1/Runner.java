package package1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.Statement;

/**
 * A sample app that connects to a Cloud SQL instance and lists all available
 * tables in a database.
 */

public class Runner {
	public static void main(String[] args) throws SQLNonTransientConnectionException, IOException, SQLException {

		 String instanceConnectionName = "static-chiller-249115:europe-west1:test2";
		 String databaseName = "mysql";

		 String IP_of_instance = "10.26.0.3";
		 String username = "<mysql username>";
		 String password = "<mysql password>";

		String jdbcUrl = String.format(
				"jdbc:mysql://%s/%s?cloudSqlInstance=%s"
						+ "&socketFactory=com.google.cloud.sql.mysql.SocketFactory&useSSL=false",
				IP_of_instance, databaseName, instanceConnectionName);

		Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

		try (Statement statement = connection.createStatement()) {
			ResultSet resultSet = statement.executeQuery("SHOW TABLES");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}