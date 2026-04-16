package POMPClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	/**
	 * This is POM class for contact page
	 * @author SANIYA ANJUM
	 * @version 27-03-06
	 */

	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewContactIcon;
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateNewContactIcon() {
		return createNewContactIcon;
	}

	/**
	 * This is a business library to click on create new contact icon
	 */
	
	public void clickOnCreateNewContactIcon() {
		getCreateNewContactIcon().click();
	}
}
