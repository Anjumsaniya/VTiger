package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POMPClassess.ContactsPage;
import POMPClassess.CreatingNewContactsPage;
import POMPClassess.HomePage;
import genericUtility.BaseClass;

public class TC_006 extends BaseClass {
	
	@Test(groups= {"System"})
	
	public void CON_003() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp =new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
     String lname = eutil.getDataFormatExcel("Contacts", 8, 1);
     String title = eutil.getDataFormatExcel("Contacts", 8, 2);
     String email = eutil.getDataFormatExcel("Contacts", 8, 3);
     String mailingcity = eutil.getDataFormatExcel("Contacts", 8, 4);
     String mailingstate = eutil.getDataFormatExcel("Contacts", 8, 5);
     String mailingcountry = eutil.getDataFormatExcel("Contacts", 8, 6);

		CreatingNewContactsPage cncp= new  CreatingNewContactsPage(driver);
		cncp.createNewContact(lname, title, email, mailingcity, mailingstate, mailingcountry);
     
     
     
	}
	

}
