/**
 * 1.DropDown Handling Without Select Class (Ans:using xpath)
 * 2.Select particular element in dropdown and break the loop
 * 3.This Code is Selenium4_1 Extension creating utility.
 */
package Oct_2019;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/fb.com");
		List<WebElement> dayOptions = driver.findElements(By.xpath("//select[@id=\"day\"]/option"));
		List<WebElement> monthOptions = driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		List<WebElement> yearOptions = driver.findElements(By.xpath("//select[@id=\"year\"]/option"));
		selectValueFromDropDownWithOptions(dayOptions,"2");
		selectValueFromDropDownWithOptions(monthOptions,"Mar");
		selectValueFromDropDownWithOptions(yearOptions,"1995");

	}

	public static void selectValueFromDropDownWithOptions(List<WebElement> Options,String value) {
		int dayCount = Options.size();
		System.out.println(dayCount);
		for (int i = 0; i < dayCount; i++) {
			String dayval = Options.get(i).getText();
			System.out.println(dayval);
			if (dayval.equals(value)) {
				Options.get(i).click();
				break;
			}
		}

	}

}
