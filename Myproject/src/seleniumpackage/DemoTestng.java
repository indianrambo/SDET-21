package seleniumpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestng {
	@Test(dependsOnMethods ="singup")
	public void singin()
	{
		System.out.println("good morning");
	}
	@Test()
	public void singup()
	{
		System.out.println("good evening");
	}

}
