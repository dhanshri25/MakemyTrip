package makemytripObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFlightObject {

	WebDriver driver;

	public SearchFlightObject(WebDriver driver) {
		this.driver=driver;
	}
//WebElement to choose way of travel
	private By roundTrip = By.xpath("//li[@data-cy='roundTrip']");
	
	//Select From city
	private By FromCity = By.xpath("//input[@id='fromCity']");
	private By FromAirport = By.xpath("//input[@placeholder='From']");
	private By ClickPune = By.xpath("//li[@id=\"react-autowhatever-1-section-0-item-0\"]");
	
	//Select To city
	private By ToCity = By.xpath("//label[@for='toCity']");
	private By ToAirport = By.xpath("//input[@placeholder='To']");
	private By ClickMumbai = By.xpath("//li[@id=\"react-autowhatever-1-section-0-item-0\"]");
	
	public void VerifyRoundTrip() {
		driver.findElement(roundTrip).click();
	}
	public void VerifyFromCity() throws Exception {
		driver.findElement(FromCity).click();
		driver.findElement(FromAirport).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(ClickPune).click();
		}
	public void VerifyToCity() throws Exception {
		driver.findElement(ToCity).click();
		driver.findElement(ToAirport).sendKeys("Mumbai");
		Thread.sleep(10000);
		driver.findElement(ClickMumbai).click();
	}
	
	//Departure and Return Date
	private By Departure = By.xpath("//div[@aria-label=\"Fri Mar 21 2025\"]");
	private By Return = By.xpath("(//div[@aria-label='Thu Apr 03 2025'])[2]");
	
	public void DateConfirnmation() {
		driver.findElement(Departure).click();
		driver.findElement(Return).click();
	}
		
}
