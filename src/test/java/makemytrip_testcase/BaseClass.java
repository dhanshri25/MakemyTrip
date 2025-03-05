package makemytrip_testcase;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import makemytripObject.SearchFlightObject;

	public class BaseClass {
		
		//Declear all object class in Base Class
		public static SearchFlightObject sfo;
		
		//Browser Setup

		public void BrowserSetup() throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			
			// Maximize window and open MakeMyTrip
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.makemytrip.com/");
			Thread.sleep(1000);
		
			System.out.print("working");
			
			
			//Objects of all Object class
			sfo = new SearchFlightObject(driver);
		}
}