package exceldatadriven;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel {
	
	public static void main(String[] args) throws InterruptedException, AWTException, EncryptedDocumentException, IOException {
			

		FileInputStream fis=new FileInputStream("./DATADRIVENTESTING/datadriventesting.xlsx");
		
	Workbook excel = WorkbookFactory.create(fis);
	Sheet sheetname = excel.getSheet("SHEET1");
	Row row = sheetname.getRow(1);
	Cell cell = row.getCell(2);
	String Value = cell.getStringCellValue();
	System.out.println(Value);
	
	
	
		
	

}

}