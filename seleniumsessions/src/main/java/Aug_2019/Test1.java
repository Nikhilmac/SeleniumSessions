package Aug_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		// Locating email web element
		WebElement emailInputbox = driver.findElement(By.id("u_0_r"));
		
		// Get value of Css property border-bottom-color which will be returned in RGB format.
		String colorCode= emailInputbox.getCssValue("border-bottom-color");
		
		System.out.println("Color code in RGB" + colorCode);
		
		String expectedColorCodeInRGB= "rgba(255, 221, 172, 1)";
		
		// Asserting actual and expected color codes
		Assert.assertEquals(colorCode, expectedColorCodeInRGB);


		// Closing driver
		driver.quit();

	}
}