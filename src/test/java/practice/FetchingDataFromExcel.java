package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcel {
 public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 
 
//	 FileInputStream fis=new FileInputStream("C:\\Users\\SANIYA ANJUM\\OneDrive\\Documents\\TestData.xlsx");
//	 Workbook wb=WorkbookFactory.create(fis);
	 
	    ExcelUtility eutil= new ExcelUtility();
	 	String value1=eutil.getDataFormatExcel("Actors", 3, 1);
		String value2=eutil.getDataFormatExcel("cartoon", 3, 1);
		System.out.println(value1);
	 	System.out.println(value2);
}
}
