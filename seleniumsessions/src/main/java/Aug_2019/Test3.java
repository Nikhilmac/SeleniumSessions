package Aug_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Test3 {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		String Actual = driver.findElement(By.cssSelector(
				"#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div.cDSmF > div > div.LXRPh > div.dEOOab.RxsGPe > div"))
				.getText();
		String Expected = "enter";
		//Assert.assertEquals(Actual,Expected);
		Assert.assertTrue(Actual.contains("Enter an email or phone number"));
		System.out.println(Actual);
		driver.quit();

	}
}