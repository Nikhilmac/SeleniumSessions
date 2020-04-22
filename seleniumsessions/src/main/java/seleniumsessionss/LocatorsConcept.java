package seleniumsessionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login?_ga=2.175359850.93233660.1558263666-2008130975.1558263666");
        Thread.sleep(6000);
	
	// 8 Locators:
	// 1.id:
	WebElement loginBtn =	driver.findElement(By.id("username"));
	loginBtn.sendKeys("nikhil@gmail.com");
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
