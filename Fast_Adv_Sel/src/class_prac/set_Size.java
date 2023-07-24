package class_prac;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class set_Size {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Selenium/interchange.html");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	Dimension d=new Dimension(100, 100);
	driver.manage().window().setSize(d);
}
}
