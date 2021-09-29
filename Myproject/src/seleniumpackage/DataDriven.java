package seleniumpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDriven { 
	public static void main(String[] args) throws IOException  {
		FileInputStream fis = new FileInputStream("D:\\image" ); 
		Properties pobj = new Properties();
		pobj.load(fis);
		String url=pobj.getProperty("url");
		String uname=pobj.getProperty("username");
		String pwd=pobj.getProperty("password");
		
				
		
	}

}
