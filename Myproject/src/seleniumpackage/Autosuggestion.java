package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("nokia");
		Thread.sleep(2000);
		List<WebElement> wb=driver.findElements(By.xpath("//ul[contains(@class,'col-12-12')]"));
		for(WebElement i : wb) {
			System.out.println(i.getText());
			driver.close();
		}
		
		
		
	}

}
