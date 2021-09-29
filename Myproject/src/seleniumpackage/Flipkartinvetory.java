package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartinvetory {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex");
		driver.findElement(By.cssSelector("button[type='submit']")).click();;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Popularity']")).click();
		String inventory=driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
	    System.out.println(inventory);
	    driver.close();
	}
	

}
