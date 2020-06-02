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

}
