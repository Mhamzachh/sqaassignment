package sqaassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class loginTests {

	@Test
	public void signupEmptyUsername() {
		//Happy Path test
		login _lg = new login();
		String username = "";
		String password = "admin";
		int expected = 0;
		int response = _lg.registerUser(username, password);
		Assert.assertEquals(0, response);
	}
	
	@Test
	public void signupEmptyPassword() {
		login _lg = new login();
		String username = "admin";
		String password = "";
		int expected = 0;
		int response = _lg.registerUser(username, password);
		Assert.assertEquals(0, response);
	}

}
