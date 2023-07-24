package webelementpgm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handle_window {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	

	//maximise the browser
	
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(2000);
	
	//fetch the parent browser id
	driver.findElement(By.id("windowButton")).click();
	String pid = driver.getWindowHandle();
	System.out.println("the parent browser id is"+pid);
	
	//Fetch the al browser id
	
	Set<String> allid = driver.getWindowHandles();
	int count=allid.size();//storing the count of browser in variable count
    System.out.println("The count of the browser"+count);//total number of browser(parent and child)
    
    //remove parent browser from child
    
    allid.remove(pid);
    int size = allid.size();//storing the count of browser in variable size
    System.out.println(size);//after removing child browser updated count
    
    
      
    
    
    
	
}
	
}