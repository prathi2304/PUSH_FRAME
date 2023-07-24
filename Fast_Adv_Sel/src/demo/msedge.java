
	package demo;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;

		public class msedge {
		public static void main (String[] args)
		{
			String Key= "webdriver.edge.driver";
			String Value = "./softwares/msedgedriver.exe";
			
			System.setProperty(Key, Value);
			WebDriver driver=new EdgeDriver();
		
		}
	}


