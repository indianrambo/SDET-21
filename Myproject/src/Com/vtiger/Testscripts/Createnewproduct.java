package Com.vtiger.Testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.vtiger.genericlib.Datautility;

public class Createnewproduct {
	public static void main(String[] args) throws IOException {
		Datautility du=new Datautility();
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(du.getdatafromproperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(du.getdatafromproperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(du.getdatafromproperty("password"));
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.cssSelector("img[title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(du.getdatafromexcel("product", 1, 3),Keys.ENTER);
		
		
	}

}
