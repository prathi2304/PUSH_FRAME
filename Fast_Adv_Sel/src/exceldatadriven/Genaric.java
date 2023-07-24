package exceldatadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Genaric {

	public static String valid(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream fis=new FileInputStream("./DATADRIVENTESTING/datadriventesting.xlsx");
		
		Workbook excel = WorkbookFactory.create(fis);
		Sheet sheetname = excel.getSheet(sheet);
		Row row2 = sheetname.getRow(row);
		Cell cell2 = row2.getCell(cell);
		String stringCellValue = cell2.getStringCellValue();
		return stringCellValue;
	
	}
}
