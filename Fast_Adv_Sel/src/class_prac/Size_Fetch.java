package class_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Size_Fetch {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Selenium/interchange.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("email"));
	Dimension size = ele.getSize();
	System.out.println(size);
	int w = size.getWidth();
	System.out.println("width is "+w);
	int h = size.getHeight();
	System.out.println("height is "+h);
}
}
