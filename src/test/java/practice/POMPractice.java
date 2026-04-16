package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POMPClassess.ContactsPage;
import POMPClassess.HomePage;
import POMPClassess.LeadsPage;
import POMPClassess.LoginPage;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class POMPractice {
	
	
	
	@FindBy(name="user_name")
	WebElement usernameTF;
	
	
	public POMPractice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   
	public static void main(String[] args) throws IOException, InterruptedException {
	SeleniumUtility sutil=new SeleniumUtility();
	PropertiesUtility putil=new PropertiesUtility();
    String URL= putil.getDataFromProperties("url");
    String UN=putil.getDataFromProperties("username");
    String PWD=putil.getDataFromProperties("password");
    WebDriver driver=new ChromeDriver();
    sutil.accessApplication(driver, URL);
    sutil.maximizeWindow(driver);
    sutil.implicitWait(driver, 15);
    //WebElement usernameTF=driver.findElement(By.name("user_name"));
   // POMPractice p =new POMPractice(driver);
  //  p.usernameTF.sendKeys(UN);
   // Thread.sleep(2000);
   // sutil.refreshWindow(driver);
   // Thread.sleep(2000);
    // p.usernameTF.sendKeys(UN);
     LoginPage lp=new LoginPage(driver);
     lp.loginToApplication(UN, PWD);
     HomePage hp=new HomePage(driver);
//     hp.clickOnLeadsMenu();
//     LeadsPage lp1=new LeadsPage(driver);
//     lp1.clickOnCreateNewLeadIcon();
     hp.clickOnContactsMenu();
     ContactsPage cp=new ContactsPage(driver);
     cp.clickOnCreateNewContactIcon();
     
     
     
	
	
	}
}
