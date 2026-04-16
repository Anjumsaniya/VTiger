package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FetchingDataFromPropertiesFile {
      
	public static void main(String[] args) throws IOException {
		
		
       WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        FileInputStream fis=new FileInputStream("C:\\Users\\SANIYA ANJUM\\OneDrive\\Desktop\\Selenium section 03\\TestData.properties");
        Properties prop=new Properties();
        prop.load(fis);
        String URL= prop.getProperty("url");
        
        String UN=prop.getProperty("username");
        

        String PWD=prop.getProperty("password");
      
        System.out.println(UN);
        System.out.println(URL);
        
        
        driver.get(URL);
        driver.findElement(By.name("username")).sendKeys(UN,Keys.TAB,PWD,Keys.ENTER);
        
        
        
        
		
	}
}
