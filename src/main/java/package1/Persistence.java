package package1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Persistence {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/dbexample";

	static final String USER = "username";
	static final String PASS = "password";

	public void run() throws ClassNotFoundException, SQLException {

		Connection conn = null;
		Statement stmt = null;

		System.out.println("Connecting to database...");

//		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
		conn = DriverManager.getConnection("jdbc:mysql://static-chiller-249115:europe-west1:test2?user=user_name");

		System.out.println("Creating statement...");

		stmt = conn.createStatement();

		String sql2 = "SELECT id, name, date FROM Languages";

		ResultSet rs = stmt.executeQuery(sql2);

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int date = rs.getInt("date");
			System.out.println("ID: " + id + ", name: " + name + ", date: " + date);
		}

		rs.close();

	}

}
