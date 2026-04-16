package POMPClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
      
	/**
	 * This is POM class for Leads web page
	 * @author SANIYA ANJUM
	 * @version 27-03-26
	 */
	
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createNewLeadIcon;
	
	
	//Initilization
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	///public getter
	
	public WebElement getCreatedNewLeadIcon() {
		return createNewLeadIcon;
	}
	
	
	/**
	 * This is a business library to click on create new lead icon
	 */
	
	public void clickOnCreateNewLeadIcon() {
		getCreatedNewLeadIcon().click();
	}
	
}
