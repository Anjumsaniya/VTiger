package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class WritingDataToExcel {
	
	public static void main(String[] args) throws IOException {
		
		// FileInputStream fis=new FileInputStream("C:\\Users\\SANIYA ANJUM\\OneDrive\\Documents\\TestData.xlsx");
		// Workbook wb=WorkbookFactory.create(fis);
		// Sheet sh=wb.createSheet("Cars");
		// Row r=sh.createRow(1);
		// Cell c = r.createCell(3);
		// c.setCellValue("hyundai");
		// FileOutputStream fos= new FileOutputStream("C:\\Users\\SANIYA ANJUM\\OneDrive\\Documents\\TestData.xlsx");
		// wb.write(fos);
		 ExcelUtility eutil=new ExcelUtility();
		 eutil.writeDataToExcel("cars",3, 1, "Benz");
	}

}
