package seleniumsessionss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		// selectvalueFromDropDown(day, "24");
		// selectvalueFromDropDown(month, "Mar");
		// selectvalueFromDropDown(year, "2002");
		// selectvalueFromDropDown(day,0);
		getlistOptions(day);
		getlistOptions(month);
		getlistOptions(year);
		selectvalueFromDropDownWithOptions(year,"1972");

	}

	public static void selectvalueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public static void selectvalueFromDropDown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/***
	 * This code is for Selecting Multiple options
	 * @param element
	 */

	public static void getlistOptions(WebElement element) {

		Select select = new Select(element);
		List<WebElement> getallOptions = select.getOptions();
		for (int i = 0; i < getallOptions.size(); i++) {
		System.out.println(getallOptions.get(i).getText());
		}

	}
		
	public static void selectvalueFromDropDownWithOptions(WebElement element, String selectvalue) {
		Select select1 = new Select(element);
		List<WebElement> Options= select1.getOptions();
		
		for(int i=0;i<Options.size();i++) {
			String value =Options.get(i).getText();
			System.out.println(value);
			if(value.equals(selectvalue)) {
				Options.get(i).click();
				break;
			}
		}
		
	}
	

}
