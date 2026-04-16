package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POMPClassess.CreatingNewLeadsPage;
import POMPClassess.HomePage;
import POMPClassess.LeadsPage;
import genericUtility.BaseClass;

public class TC_002Test extends BaseClass  {
	
	@Test(groups= {"Smoke"})
	public void LE_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		String lname = eutil.getDataFormatExcel("Leads", 5, 1);
		String company = eutil.getDataFormatExcel("Leads", 5, 2);
		String title = eutil.getDataFormatExcel("Leads", 5, 3);
		String leadSource = eutil.getDataFormatExcel("Leads", 5, 4);
		String noOfEmp = eutil.getDataFormatExcel("Leads", 5, 5);
		CreatingNewLeadsPage cnlp= new  CreatingNewLeadsPage(driver);
		cnlp.CreateNewLead(lname,company,title,leadSource,noOfEmp);
		System.out.println("LE_002 successfull");

	}
}