package webelementpgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class radiobutton{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/user/Desktop/Selenium/radiobutton.html");
	Thread.sleep(2000);
	 WebElement dd = driver.findElement(By.xpath(value="1"));
	 Select Sel = new Select(dd);
	 Sel.selectByValue("1");
	 
	
	 
	 
	  
	
	
	
}
}