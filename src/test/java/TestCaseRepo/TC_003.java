package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POMPClassess.CreatingNewLeadsPage;
import POMPClassess.HomePage;
import POMPClassess.LeadsPage;
import genericUtility.BaseClass;

public class TC_003 extends BaseClass  {
	
	@Test(groups= {"Regression"})
	
	public void LE_003() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lname = eutil.getDataFormatExcel("Leads", 9, 1);
		String company = eutil.getDataFormatExcel("Leads", 9, 2);
		String mobile = eutil.getDataFormatExcel("Leads", 9, 3);
		String email = eutil.getDataFormatExcel("Leads", 9, 4);
		String city = eutil.getDataFormatExcel("Leads", 9, 5);
		String state = eutil.getDataFormatExcel("Leads", 9, 6);
		String country = eutil.getDataFormatExcel("Leads", 9, 7);
		CreatingNewLeadsPage cnlp= new  CreatingNewLeadsPage(driver);
		cnlp.CreateNewLead(lname,company,mobile,email,city,state,country);
		
		
	}
	
	

}
