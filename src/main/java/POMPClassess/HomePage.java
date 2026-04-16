package POMPClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage {
	
	
	/**
	 * This is POMclass for the home page
	 * @author SANIYA ANJUM
	 * @version 27-03-26
	 */
     
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadMenu;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactMenu;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement SignOutOptions;

  
     //Initializing

     public HomePage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
    	 
     }

     //public getters


	 public WebElement getLeadMenu() {
		 return leadMenu;
	 }




	 public WebElement getContactMenu() {
		 return contactMenu;
	 }




	 public WebElement getAccountsIcon() {
		 return accountsIcon;
	 }




	 public WebElement getSignOutOptions() {
		 return SignOutOptions;
	 }
	 
	 /**
	  * This is a business library to click on Leads menu
	  */
     
     public void clickOnLeadsMenu() {
    	 getLeadMenu().click();
    	 
     }
     /**
      * This is a business library to click on Contacts menu
      */
     public void clickOnContactsMenu() {
    	 getContactMenu().click();
     }
     
     /**
      * This is a business library to perform sign out operation
     * @param driver 
      */
     public void signoutOperation(WebDriver driver) {
    	 SeleniumUtility sutil=new SeleniumUtility();
    	 sutil.mouseHovering(driver, getAccountsIcon());
    	 getSignOutOptions().click();
     }
     
     
     
     
}