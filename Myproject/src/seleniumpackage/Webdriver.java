package seleniumpackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(1000);
	List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
       int count=0;
       for(WebElement i : alllinks)
       {
    	   System.out.println(i.getText());
    	   count++;
       }
       System.out.println("total links are :" +count);
	}
		
	}

