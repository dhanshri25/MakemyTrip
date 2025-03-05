package makemytrip_testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class SearchFlightTestcase extends BaseClass{
	
	@BeforeTest
	  public void Precondition() throws InterruptedException {
		BrowserSetup();
	  }
	@Test(description= "TestCase to implement SearchFlightObject class" )
	public void flightsearching() throws Exception{
		sfo.VerifyRoundTrip();
		sfo.VerifyFromCity();
		sfo.VerifyToCity();
		sfo.DateConfirnmation();
		}
}
