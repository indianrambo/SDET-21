package Com.vtiger.genericlib;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass {
	public WebDriver driver;
	public Datautility du=new Datautility();
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void lunchbrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.out.println("chrome browser launch");
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("firefox browser launch");
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("opera"))
		{
			System.out.println("opera browser launch");
			System.setProperty("webdriver.opera.driver","E:\\operadriver\\operadriver_win64\\operadriver.exe");
			driver=new OperaDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException
	{
	System.out.println("login to app");
	driver.get(du.getdatafromproperty("url"));
	driver.findElement(By.name("user_name")).sendKeys(du.getdatafromproperty("username"));
	driver.findElement(By.name("user_password")).sendKeys(du.getdatafromproperty("password"));
	driver.findElement(By.id("submitButton")).click();
	}
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		System.out.println("logout from app");
		WebElement signout=driver.findElement(By.xpath("//span[text()=' Administrator']/../following-sibling::td[1]/img"));
		Actions act= new Actions(driver);
		act.moveToElement(signout).perform();
		driver.findElement(By.linkText("Sign Out")).click();
	}
	@AfterClass(alwaysRun=true)
	public void closebrowser()
	{
		System.out.println("close browser");
		driver.quit();
	}
	
	
}
