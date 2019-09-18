package package1;

import java.sql.SQLException;

/**
 * A sample app that connects to a Cloud SQL instance and lists all available
 * tables in a database.
 */

public class Runner {
	public static void main(String[] args) {

		Persistence persistence = new Persistence();
		try {
			persistence.run();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}
}
