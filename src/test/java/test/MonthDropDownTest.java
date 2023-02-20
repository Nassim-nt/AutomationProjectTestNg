package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import page.MonthDropDownPage;

public class MonthDropDownTest {
	WebDriver driver;
	

	@Test
     public void validateMonthDropDownHasAllMonths() {
    	 driver = BrowserFactory.init();
    	 MonthDropDownPage monthDropDownPage = PageFactory.initElements( driver, MonthDropDownPage.class);
    	 monthDropDownPage.validateMonthsInMonthDrop();
    	 BrowserFactory.tearDown();
     }
		
	
	
	
}
