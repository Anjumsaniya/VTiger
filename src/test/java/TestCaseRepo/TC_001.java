package TestCaseRepo;

import java.io.IOException;



import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMPClassess.CreatingNewLeadsPage;
import POMPClassess.HomePage;
import POMPClassess.LeadsPage;
import genericUtility.BaseClass;



@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001  extends BaseClass{
	
	int i=1;
	@Test(groups= {"Regression","System"})
	public void LE_001() throws EncryptedDocumentException, IOException {
		HomePage hp= new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
	//	if(i<=3) {
			//i++;
		//Assert.fail();
		//}
		String fname = eutil.getDataFormatExcel("Leads", 1, 1);
		String lname = eutil.getDataFormatExcel("Leads", 1, 2);
		String company = eutil.getDataFormatExcel("Leads", 1, 3);
		CreatingNewLeadsPage cnlp= new  CreatingNewLeadsPage(driver);
		cnlp.CreateNewLead(fname,lname,company);
		
		
	}

	 
	
	
	
	
	
	
	
	
	
	
}
