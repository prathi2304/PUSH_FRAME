package webelementpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class pgm2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Selenium/sample.html");
	Thread.sleep(2000);
           WebElement ele = driver.findElement(By.tagName("input"));
             boolean b = ele.isEnabled();
             if(b)
             {
            	 System.out.println("is enabled");
            	 
             }
             else
             {
             System.out.println("not enabled");
             }
             
}
}
