package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lunchchrome {
   public static void main(String[] args) {
	    
	System.setProperty("webdriver.chrome.driver" , "E:\\chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	String latesttitle =driver.getCurrentUrl();
	System.out.println(latesttitle);
	String sourcecode=driver.getPageSource();
	System.out.println(sourcecode );
	driver.close(); 
}
}
 