package webelementpgm;

import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/user/Desktop/Selenium/Primary.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
}
}
