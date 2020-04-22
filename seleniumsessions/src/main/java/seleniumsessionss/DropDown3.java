package seleniumsessionss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));

		Select select = new Select(month);
		select.selectByIndex(1);
		System.out.println(select.isMultiple());

		List<WebElement> monthoptions = select.getOptions();
		System.out.println(monthoptions.size());
		for (int i = 0; i < monthoptions.size(); i++) {

			String value = monthoptions.get(i).getText();
			System.out.println(value);
			
			if(value.equals("Nov")) {
				monthoptions.get(i).click();
		        break;	
			}
			

		}
	}

}
