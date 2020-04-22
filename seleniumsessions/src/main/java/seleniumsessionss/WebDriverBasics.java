package seleniumsessionss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Title MisMatch");
		}
		
		driver.quit();
		
		


	}

}
