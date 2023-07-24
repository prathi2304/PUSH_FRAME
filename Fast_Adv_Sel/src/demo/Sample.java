package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException{
	String key="webdriver.gecko.driver";
	String value="./softwares/geckodriver.exe";
	
	System.setProperty(key, value);
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("https://.google.com");
	Thread.sleep(2000);
	driver.close();
	

}
}
