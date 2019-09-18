package package1;

public class Try {
	
//	import java.io.IOException;
//	import java.sql.Connection;
//	import java.sql.DriverManager;
//	import java.sql.ResultSet;
//	import java.sql.SQLException;
//	import java.sql.SQLNonTransientConnectionException;
//	import java.sql.Statement;
//
//	/**
//	* A sample app that connects to a Cloud SQL instance and lists all available tables 
//	in a database.
//	*/
//
//	public class Cloud_sql {
//	public static void main(String[] args) throws SQLNonTransientConnectionException 
//	,IOException, SQLException {
//
//	String instanceConnectionName = <Your instanceConnectionName>;
//	String databaseName = <Database name from which u want to list tables>;
//
//
//	String IP_of_instance = <IP address of the instance>;
//	String username = <mysql username>;
//	String password = <mysql password>;
//
//	String jdbcUrl = String.format(
//	    "jdbc:mysql://%s/%s?cloudSqlInstance=%s"
//	        + "&socketFactory=com.google.cloud.sql.mysql.SocketFactory&useSSL=false",
//	IP_of_instance,
//	    databaseName,
//	    instanceConnectionName);
//
//	Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
//
//	try (Statement statement = connection.createStatement()) {
//	  ResultSet resultSet = statement.executeQuery("SHOW TABLES");
//	  while (resultSet.next()) {
//	    System.out.println(resultSet.getString(1));
//	  }
//	}catch(Exception e){
//	  e.printStackTrace();
//	}
//	}
//	}
	
//	package package1;
//	import java.sql.SQLException;
//
//	public class Runner {
//		
//		public static void main(String[] args) {
//			
//			Input input = new Input();
//			input.start();
//			
//			Persistence pers = new Persistence();
//			try {
//				pers.run();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//
//	}
	
	
	

}
