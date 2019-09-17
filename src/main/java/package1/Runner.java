package package1;
import java.sql.SQLException;

public class Runner {
	
	public static void main(String[] args) {
		
		Input input = new Input();
		input.start();
		
		Persistence pers = new Persistence();
		try {
			pers.run();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
