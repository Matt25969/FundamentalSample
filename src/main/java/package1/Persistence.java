package package1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Persistence {

//	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//	static final String DB_URL = "jdbc:mysql://localhost/dbexample";
//
//	static final String USER = "username";
//	static final String PASS = "password";

	public void run() throws ClassNotFoundException, SQLException {

		System.out.println("Connecting to database...");
		
		String jdbcUrl = "jdbc:mysql://34.77.28.62:3306/";
		String databaseName = "IMS";
		String username = "root";
		String password = "";

		Connection connection = DriverManager.getConnection(jdbcUrl + databaseName, username, password);
		
		Input input = new Input();
		input.start(connection);


	}

}
