package seleniumsessions.seleniumsessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;

	@Test
	public void f() {
		String name = driver.getTitle();
		System.out.println(name);

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test :::: Driver Close ");
		driver.quit();
	}

}
