package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;
import page.UserAbleToAddCategogyPage;


public class UserAbleToAddCategoryTest {

	WebDriver driver;
	
	
	@Test
	public void validateAddCategory() {
		driver = BrowserFactory.init();

		UserAbleToAddCategogyPage userAbleToAddCategogyPage = PageFactory.initElements(driver, UserAbleToAddCategogyPage.class);
		userAbleToAddCategogyPage.insertCategoryName("Test$0013");
			
		BrowserFactory.tearDown();
	}
	
	
	
	
	
}
