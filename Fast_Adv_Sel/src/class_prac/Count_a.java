package class_prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count_a {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	  List<WebElement> links = driver.findElements(By.xpath("//a"));
	 int count = links.size();
	System.out.println(count);
//	for(int i=0;i<count;i++)
//	{
//		WebElement link = links.get(i);
//		String txt = link.getText();
//		System.out.println(txt);
//	}
	
	for(WebElement link:links)
	{
		String text = link.getText();
		System.out.println(text);
	}
}
}
