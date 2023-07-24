package exceldatadriven;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.crypto.Data;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	Date d=new Date();
	String date = d.toString();
	String date1 = date.replaceAll(":", "-");
	System.out.println(date1);
	String photo=".\\photos\\";
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
		File fis=new File(photo+date1+".jpeg");
		FileHandler.copy(src, fis);
	}
}
