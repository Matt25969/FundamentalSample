package persistence;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersistenceTest {
	
	Persistence peristence;
	
	@Before
	public void setup() {
		
		this.peristence = new Persistence();
		
	}
	
	@Test
	public void createConnectionTest() {
		
		Assert.assertNotNull(peristence.createConnection());
		
	}

}
