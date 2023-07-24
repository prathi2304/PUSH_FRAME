package exceldatadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_login {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./DATADRIVENTESTING/datadriventesting1.xlsx");
	
	Workbook excel = WorkbookFactory.create(fis);
	Sheet sheetname = excel.getSheet("Sheet2");
	Row row = sheetname.getRow(0);
	Cell cell = row.getCell(0);
	String Value = cell.getStringCellValue();
	System.out.println(Value);
	 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.id("email")).sendKeys(Value);
}
}
