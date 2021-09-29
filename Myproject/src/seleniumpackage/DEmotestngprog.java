package seleniumpackage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DEmotestngprog {
	@BeforeClass
	public void laucnhbrowser()
	{
		System.out.println("launch");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("login");
	}
	@Test
	public void createuser()
	{
	Reporter.log("user craeted",true);
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("close browser");
	}

}
