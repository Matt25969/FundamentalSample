package Main;
import java.sql.SQLException;

public class Runner {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Input input = new Input();
		input.start();
		
		Persistence pers = new Persistence();
		pers.run();
		
	}

}
