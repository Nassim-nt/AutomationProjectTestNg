package page;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class MonthDropDownPage extends BasePage {

	WebDriver driver;

	public MonthDropDownPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "due_month")
	WebElement MonthsButtonDropDown;

	String ExistingMonths;
	String firstPathMonth = "//option[text()='";
	String endPathMonth = "']";

	public void validateMonthsInMonthDrop() {
		
		Map<String, Integer> myC = new HashMap<String, Integer>();
		myC.put("Jan", 1);
		myC.put("Feb", 2);
		myC.put("Mar", 3);
		myC.put("Apr", 4);
		myC.put("May", 5);
		myC.put("Jun", 6);
		myC.put("Jul", 7);
		myC.put("Aug", 8);
		myC.put("Sep", 9);
		myC.put("Oct", 10);
		myC.put("Nov", 11);
		myC.put("Dec", 12);

		MonthsButtonDropDown.click();
		for (String item : myC.keySet()) {
			ExistingMonths = driver.findElement(By.xpath(firstPathMonth + item + endPathMonth)).getText();
			System.out.println(ExistingMonths);

	}
		 String actualmonths = myC.toString();
	       System.out.println(actualmonths);
	       
	       
	       Map<String, Integer> expectedMonths = new HashMap<String, Integer>();
			myC.put("Jan", 1);
			myC.put("Feb", 2);
			myC.put("Mar", 3);
			myC.put("Apr", 4);
			myC.put("May", 5);
			myC.put("Jun", 6);
			myC.put("Jul", 7);
			myC.put("Aug", 8);
			myC.put("Sep", 9);
			myC.put("Oct", 10);
			myC.put("Nov", 11);
			myC.put("Dec", 12);
			

		for (int m=1; m<=12; m++) {
			Assert.assertEquals( expectedMonths.get(m), myC.get(m));
			
		}
		
	}
}
