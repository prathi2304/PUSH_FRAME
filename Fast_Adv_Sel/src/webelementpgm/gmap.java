package webelementpgm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class gmap {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	

	//maximise the browser
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com/maps");
	Thread.sleep(2000);
	
	//click on direction 
	WebElement dir= driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[1]/div/div[2]/div[3]/button/div"));
		dir.click();
	
	
WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"directions-searchbox-0\"]/button[2]"));
	ele1.sendKeys("bangalore");
	
	
/*WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"sb_ifc51\"]/input"));
	ele2.sendKeys("mysore");*/
	
/*
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	Actions act=new Actions(driver);
	WebElement ele = driver.findElement(By.xpath(""));
	act.moveToElement(ele).perform();
	ele.click();*/	
	
	
	
	
    
	
}
	
}