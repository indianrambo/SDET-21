package Com.vtiger.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Com.vtiger.genericlib.Baseclass;

public class Createnewlead extends Baseclass{
	@Test(groups= {"intigrity"})
	public void newleadcreation() throws EncryptedDocumentException, IOException
	{
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
		driver.findElement(By.cssSelector("img[title='Create Lead...']")).click();
		driver.findElement(By.name("lastname")).sendKeys(du.getdatafromexcel("leads", 1, 3));
		driver.findElement(By.name("company")).sendKeys(du.getdatafromexcel("leads", 1, 4),Keys.ENTER);
		System.out.println("lead create sucessfully");
		
	}
	

}
