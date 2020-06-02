import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import sqaassignment.loginTests;
import sqaassignment.sessionTests;

@RunWith(Suite.class)
@SuiteClasses({ loginTests.class, sessionTests.class})
public class UnitTests {

}
