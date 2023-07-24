package webelementpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class pgm4 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Selenium/interchange.html");
	Thread.sleep(2000);
           WebElement ele = driver.findElement(By.id("manual"));
           WebElement ele1 = driver.findElement(By.id("Automation"));
           WebElement ele2 = driver.findElement(By.id("a1"));
           
           ele.sendKeys(Keys.CONTROL+"ax");// select all and cut
           ele2.sendKeys(Keys.CONTROL+"v");//and copy to 3rd empty box
           ele1.sendKeys(Keys.CONTROL+"ax");
           ele.sendKeys(Keys.CONTROL+"v");
           ele2.sendKeys(Keys.CONTROL+"ax");
           ele1.sendKeys(Keys.CONTROL+"v");
           
           
           
           
          
           
           
             
             
}

	private static WebElement sendKeys(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}


