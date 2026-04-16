package POMPClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactsPage {
	
	@FindBy(name="firstname")private WebElement fnameTF;
	@FindBy(name="lastname")private WebElement lnameTF;
	@FindBy(name="title")private WebElement titleTF;
	@FindBy(name="department")private WebElement departmentTF;
	@FindBy(name="email")private WebElement emailTF;
	@FindBy(name="mobile")private WebElement mobileTF;
	@FindBy(name="mailingcity")private WebElement mailingcityTF;
	@FindBy(name="mailingstate")private WebElement mailingstateTF;
	@FindBy(name="mailingcountry")private WebElement mailingcountryTF;
	@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement saveButton;

	
	//initialization
	
	public  CreatingNewContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//public getter

		
	
	public WebElement getFnameTF() {
		return fnameTF;
	}

	public WebElement getLnameTF() {
		return lnameTF;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getDepartmentTF() {
		return departmentTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getMobileTF() {
		return mobileTF;
	}

	public WebElement getMailingcityTF() {
		return mailingcityTF;
	}

	public WebElement getMailingstateTF() {
		return mailingstateTF;
	}

	public WebElement getMailingcountryTF() {
		return mailingcountryTF;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	
	//utilizing
	
	
		public void createNewContact(String fname,String lname,String title) {
			getFnameTF().sendKeys(fname);
			getLnameTF().sendKeys(lname);
			getTitleTF().sendKeys(title);
			getSaveButton().click();
		}

	public void createNewContact(String lname,String dept, String email,String mob) {
		getLnameTF().sendKeys(lname);
		getDepartmentTF().sendKeys(dept);
		getEmailTF().sendKeys(email);
		getMobileTF().sendKeys(mob);
		getSaveButton().click();
	}
	
	
	public void createNewContact(String lname,String title,String email, String mailingCity,String mailingState, String  mailingCountry) {
		getLnameTF().sendKeys(lname);
		getTitleTF().sendKeys(title);
		getEmailTF().sendKeys(email);
		getMailingcityTF().sendKeys(mailingCity);
		getMailingstateTF().sendKeys(mailingState);
		getMailingcountryTF().sendKeys(mailingCountry);
		getSaveButton().click();
		
		
	}
	
	
	
	
	
	
	
	

}
