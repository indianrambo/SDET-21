package seleniumpackage;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class DatadrivenTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\image\\vtiger.propoties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String url=pobj.getProperty("url");
		System.out.println(url);
		
	}

}
 