package exceldatadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Excel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
	FileInputStream fis=new FileInputStream("./DATADRIVENTESTING/datadriventesting.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet("Sheet1");//book.createSheet("sheetname");
	Row crow = sheet.createRow(0);
	Cell ccell = crow.createCell(0);
				ccell.setCellValue("hii");

	FileOutputStream fout=new FileOutputStream("./DATADRIVENTESTING/datadriventesting.xlsx");
		book.write(fout);

	
	}
}
