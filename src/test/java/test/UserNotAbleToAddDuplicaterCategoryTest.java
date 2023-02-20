package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;

import page.UserNotAbleToAddDuplicatedCategogyPage;

public class UserNotAbleToAddDuplicaterCategoryTest {

	WebDriver driver;

	
	@Test
	public void validateUserNotAbleToAddDuplicatedCathegory() {
		driver = BrowserFactory.init();

		UserNotAbleToAddDuplicatedCategogyPage userNotAbleToAddDuplicatedCategogyPage = PageFactory.initElements(driver, UserNotAbleToAddDuplicatedCategogyPage.class);
		userNotAbleToAddDuplicatedCategogyPage.insertDuplicatedCathegoryName("Test#0012");
		BrowserFactory.tearDown();
	}
}
