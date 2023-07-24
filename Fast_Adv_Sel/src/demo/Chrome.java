package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main (String[] args)
	{
		String Key= "webdriver.chromedriver.driver";
		String Value = "./software/chromedriver.exe";
		
		System.setProperty(Key, Value);
		ChromeDriver driver=new ChromeDriver();
		
	
	}
}
