package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class DemoTest extends BaseTest
{

	@Test
	public void testDemo()
	{
		Reporter.log("test demo...",true);
		Assert.fail();
	}
}
