package Oct_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4_4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		String aa = driver.getTitle();
		System.out.println(aa);
		String excepted = "Facebook – log in or sign up";
		if (aa.equals(excepted)) {
			//driver.get("https://fb.com");
			driver.findElement(By.id("email")).sendKeys("8444");
			driver.findElement(By.name("pass")).sendKeys("78787889");
			driver.findElement(By.id("loginbutton")).click();
			
		} else {
			System.out.println("Fail");
		}

	}

}
