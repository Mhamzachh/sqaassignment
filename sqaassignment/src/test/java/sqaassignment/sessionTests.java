package sqaassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class sessionTests {

	@Test
	public void sessionNew() {
		sessionManager sM = new sessionManager();
		int response = sM.createSession(1, 2);
		int expected = 1;
		Assert.assertEquals(expected, response);
	}
	@Test
	public void sessionNull() {
		sessionManager sM = new sessionManager();
		Assert.assertNull(sM.findSession(1));
	}
	@Test
	public void sessionNonExisting() {
		//Boundary Value test
		sessionManager sM = new sessionManager();
		int actual = sM.checkStatus(1);
		
		Assert.assertTrue(actual > 0);
	}

}
