package seleniumsessionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));

		Select select = new Select(day);
		select.selectByVisibleText("24");

		Select select1 = new Select(month);
		select1.selectByVisibleText("Feb");

		Select select2 = new Select(Year);
		select2.selectByVisibleText("1995");

		driver.close();

	}

}
