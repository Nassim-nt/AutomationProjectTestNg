package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public void selectFromDrowdown (WebElement element, String visibleTest) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleTest);
	}
	
	public int generateRandomNum (int boundruNum) {
		Random rnd = new Random();
		int generateNum = rnd.nextInt(boundruNum);
		return generateNum;
	}
}
