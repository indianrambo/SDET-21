package Com.vtiger.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Com.vtiger.genericlib.Baseclass;

public class Createnewcontact extends Baseclass {
	@Test(groups= {"smoke"})
	public void newcontactcreation() throws EncryptedDocumentException, IOException
	{
		driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
		driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys(du.getdatafromexcel("contacts", 1, 3),Keys.ENTER);
		System.out.println("contact creat sucessfully");
	}
	

}
