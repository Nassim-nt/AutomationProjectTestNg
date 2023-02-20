package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserAbleToAddCategogyPage extends BasePage {

	WebDriver driver;

	public UserAbleToAddCategogyPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[type='text'][name='categorydata']")
	WebElement AddCategoryField;
	@FindBy(how = How.CSS, using = "input[name='submit'][value='Add category']")
	WebElement AddCategoryButton;
	@FindBy(how = How.CSS, using = "body")
	WebElement BodyPath;
	@FindBy(how = How.XPATH, using = "/html/body/a[1]")
	WebElement YesForDelete;
	@FindBy(how = How.XPATH, using = "/html/body/a[2]")
	WebElement NevermindButton;

	String userCategory1;
	String actualAlertMessage;
	String expectedAlertMessage = "The category you want to add already exists:" + userCategory1 + ".";
	String firstCateroryNmame = "//span[contains(text(), '";
	String endCategoryName = "')]";
	String userCategory;
	String userCategoryname;
	String Createdcategory;

	public void insertCategoryName(String userCategory1) {

		List<WebElement> categoryElements = driver.findElements(By.className("controls"));

		List<String> categoryNames = new ArrayList<String>();
		for (WebElement categoryElement : categoryElements) {
			categoryNames.add(categoryElement.getText());
		}
		if (categoryNames.contains(userCategory1)) {
			testWhenCategoryNameExistOnList(userCategory1);
		} else {

			testWhenCategoryNameDoesNotExistOnList(userCategory1);
		}

	}

	public void testWhenCategoryNameDoesNotExistOnList(String userCategory1) {
		AddCategoryField.sendKeys(userCategory1);
		AddCategoryButton.click();
		Createdcategory = driver.findElement(By.xpath(firstCateroryNmame + userCategory1 + endCategoryName)).getText();
		System.out.println("Category name created is : " + userCategory1);
		driver.findElement(By.xpath(firstCateroryNmame + userCategory1 + endCategoryName)).click();
		driver.getTitle();
		driver.getWindowHandle();
		YesForDelete.click();
	}

	public void testWhenCategoryNameExistOnList(String userCategory1) {
		
		
		driver.findElement(By.xpath(firstCateroryNmame + userCategory1 + endCategoryName)).click();
		driver.getTitle();
		driver.getWindowHandle();
		YesForDelete.click();
		driver.getTitle();
		driver.getWindowHandle();
		AddCategoryField.sendKeys(userCategory1);
		AddCategoryButton.click();
		Createdcategory = driver.findElement(By.xpath(firstCateroryNmame + userCategory1 + endCategoryName)).getText();
		System.out.println(Createdcategory);

	}

}
