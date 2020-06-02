package sqaassignment;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class sessionIT {

	@Test
	public void test() {
		sessionManager manager = new sessionManager();
		login _login = new login();
		
		int userId = _login.registerUser("admin", "admin");
		int response = manager.createSession(userId, 5);
		Assert.assertEquals(1, response);
		
	}

}
