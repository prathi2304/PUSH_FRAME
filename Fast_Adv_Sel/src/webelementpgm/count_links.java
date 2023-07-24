package webelementpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
public class count_links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
   List<WebElement> links = driver.findElements(By.xpath(("//a")));
   int count = links.size();
   System.out.println(count);
   
   for(WebElement link:links)
	{
		String text = link.getText();
		System.out.println(text);
	}
		
	}
}
