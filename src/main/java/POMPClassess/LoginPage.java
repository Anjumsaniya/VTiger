package POMPClassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	/**
	 * This is a POMclass for login webpage
	 * @author SANIYA ANJUM
	 * @version 27-03-26
	 */
	
	
	 //Declaring the WebElements///
	
	
	
	@FindBy(name="user_name")
	private WebElement usernameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	//Initializing the WebElements
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	 //public getters
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}
	
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Utilizing the WebElements
	
	/**
	 * This is a business library to login to the web application
	 * @param UN
	 * @param PWD
	 */
	
	  public void loginToApplication(String UN,String PWD) {
		  getUsernameTextField().sendKeys(UN);
		  getPasswordTextField().sendKeys(PWD);
		  getLoginButton().click();
	  }
	
	
	
	
}

