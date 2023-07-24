package webelementpgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(2000);
	 WebElement dd = driver.findElement(By.id("day"));
	 Select Sel = new Select(dd);
	 Sel.selectByValue("16");
	 
	 WebElement ddm = driver.findElement(By.id("month"));
	 Select Sel1=new Select(ddm);
	 Sel1.selectByVisibleText("Nov");
	
	 WebElement ddy = driver.findElement(By.id("year"));
	 Select Sel2=new Select(ddy);
	 Sel2.selectByIndex(4);
	
	 
	 
	  
	
	
	
}
}