package Com.vtiger.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Com.vtiger.genericlib.Baseclass;

public class Createnewproductgold extends Baseclass{
	@Test(groups= {"smoke","intigrity"})
	public void newproductcreation() throws EncryptedDocumentException, IOException
	{
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.cssSelector("img[title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(du.getdatafromexcel("product", 1, 3),Keys.ENTER);
		System.out.println("product create sucessfully");
		
	}

}
