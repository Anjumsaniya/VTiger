package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import genericUtility.PropertiesUtility;

public class WritingDataToProperties {
	
	public static void main(String[] args) throws IOException {
		
		// FileInputStream fis=new FileInputStream("C:\\Users\\SANIYA ANJUM\\OneDrive\\Desktop\\Selenium section 03\\TestData.properties");
	       // Properties prop=new Properties();
	     //   prop.load(fis);
	       // prop.setProperty("mobile", "7894561231");
		// FileOutputStream fis=new FileOutputStream("C:\\Users\\SANIYA ANJUM\\OneDrive\\Desktop\\Selenium section 03\\TestData.properties");
		 //prop.store(fos,"mobile number updated");
		PropertiesUtility putil=new PropertiesUtility();
		putil.writeDataToProperties("name", "nick", "name is updated");

		
		
		
		
	}

}
