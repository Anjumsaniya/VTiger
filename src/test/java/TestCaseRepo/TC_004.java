package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POMPClassess.ContactsPage;
import POMPClassess.CreatingNewContactsPage;
import POMPClassess.HomePage;
import genericUtility.BaseClass;

public class TC_004 extends BaseClass {
	@Test(groups= {"Smoke","System"})
	public void CON_001() throws EncryptedDocumentException, IOException {
		HomePage hp= new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		String fname=eutil.getDataFormatExcel("Contacts", 1, 1);
		String lname= eutil.getDataFormatExcel("Contacts", 1, 2);
		String title = eutil.getDataFormatExcel("Contacts", 1, 3);
		CreatingNewContactsPage cncp= new  CreatingNewContactsPage(driver);
		cncp.createNewContact(fname, lname, title);
		

	}
	 
	

}
